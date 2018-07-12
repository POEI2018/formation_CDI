package fr.gtm.project.proxibanque.persistence;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

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

	//Session session;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientDao() {	
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
