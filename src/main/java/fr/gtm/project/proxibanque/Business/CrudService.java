package fr.gtm.project.proxibanque.Business;

import javax.inject.Inject;

import fr.gtm.project.proxibanque.domain.HbEntity;
import fr.gtm.project.proxibanque.persistence.Repository;

public class CrudService <ENTITY extends HbEntity> {
	
	@Inject
	private transient Repository <ENTITY> repository ;
	
	public ENTITY create (ENTITY entity) {
		if (entity.getId() != null) {
			throw new IllegalArgumentException("Can not create an entity that already has an identifier") ;
		}
		return this.repository.save(entity);
	}
	
	public ENTITY read(Integer id) {
		return this.repository.findOne(id);
	}
	
	public ENTITY update(ENTITY entity) {
		if (entity.getId() != null) {
			throw new IllegalArgumentException("Can not update an entity that already has an identifier") ;
		}
		return this.repository.save(entity);
	}
	
	public void delete (Integer id) {
		this.repository.deleteById(id);
	}
	

}
