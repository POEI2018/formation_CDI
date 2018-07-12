package fr.gtm.project.proxibanque.Business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.project.proxibanque.domain.Client;
import fr.gtm.project.proxibanque.persistence.ClientDao;

@Named
@ApplicationScoped
public class ClientService {

	@Inject
	private ClientDao clientDao ;
	
	public String createClient(final String name) {
		final Client client = new Client();
		client.setLastname(name);
		this.clientDao.save(client);
		return "C'est bien créé dans ma base de donnée" ; 
	}
}
