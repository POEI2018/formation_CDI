package fr.gtm.project.proxibanque.persistence;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import org.hibernate.Session;

import fr.gtm.project.proxibanque.domain.Client;

/**
 * Bean CDi declaré avec Named par le "Default" qualifier et de scope
 * "Singleton" grace a ApplicationScoped
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class ClientDao extends Repository<Client> {

	Session session;

	public ClientDao() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public void create(Client client) {
		this.session.beginTransaction();
		// this.entityManager.persist(client);
		// this.entityManager.getTransaction().commit();
	}

	@Override
	public List<Client> findAll() {
		return this.findAll(Client.class);
	}

	@Override
	public Client findOne(Integer id) {
		return this.findOne(new Client(), id);
	}

}
