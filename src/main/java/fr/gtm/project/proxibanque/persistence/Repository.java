package fr.gtm.project.proxibanque.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.gtm.project.proxibanque.domain.HbEntity;

public abstract class Repository<ENTITY extends HbEntity> implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(Repository.class);
	protected Session session;

	public Repository() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public ENTITY save(ENTITY entity) {
		this.executeInTransaction(() -> this.session.saveOrUpdate(entity));
		return entity;
	}

	protected List<ENTITY> findAll(Class<ENTITY> clazz) {
		final List<ENTITY> entities = new ArrayList<>();
		final TypedQuery<ENTITY> query = this.session.
				createQuery("SELECT e FROM" + clazz.getSimpleName() + " e", clazz);
		entities.addAll(query.getResultList());

		return entities;
	}

	public abstract List<ENTITY> findAll();

	public ENTITY delete(ENTITY entity) {
		this.deleteById(entity.getId());
		return entity;
	}

	public void deleteById(Integer id) {
		this.executeInTransaction(() -> this.session.delete(this.findOne(id)));
	}

	public abstract ENTITY findOne(Integer id);

	@SuppressWarnings("unchecked")
	protected ENTITY findOne(ENTITY entity, Integer id) {
		return (ENTITY) this.session.find(entity.getClass(), id);
	}

	private void executeInTransaction(Runnable task) {
		this.session.beginTransaction();
		try {
			task.run();
			this.session.getTransaction().commit();
		} catch (HibernateException e) {
			LOGGER.error("Impossible de mettre a jour cette entité : ", e);
			this.session.getTransaction().rollback();
		}
	}

}
