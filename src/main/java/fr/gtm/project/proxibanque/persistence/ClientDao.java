package fr.gtm.project.proxibanque.persistence;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;

import fr.gtm.project.proxibanque.domain.Client;

/**
 * Bean CDi declaré avec Named par le "Default" qualifier et de scope "Singleton" 
 * grace a ApplicationScoped
 * 
 * @author Adminl
 *
 */
@Named
@ApplicationScoped
public class ClientDao {
	
	EntityManager entityManager ; 
	

	public ClientDao() {
		this.entityManager = HibernateUtil.getSessionFactory().createEntityManager() ;
	}
	
	public void create(Client client) {
		this.entityManager.getTransaction().begin() ;
		this.entityManager.persist(client);
		this.entityManager.getTransaction().commit();
	}

	
	
	
	
	

}
