package fr.gtm.project.proxibanque.Business;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.project.proxibanque.domain.Client;

@Named
@ApplicationScoped
public class ClientService extends CrudService<Client> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*@Inject
	private transient ClientDao clientDao ;
	
	public String createClient(final String name) {
		final Client client = new Client();
		client.setLastname(name);
		this.clientDao.save(client);
		return "C'est bien créé dans ma base de donnée" ; 
	}*/
}
