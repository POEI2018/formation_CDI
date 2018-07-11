package fr.gtm.project.proxibanque.Business;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.project.proxibanque.persistence.ClientDao;

@Named
@ApplicationScoped
public class ClientService {

	@Inject
	private ClientDao clientDao ;
	
	public String test() {
		return this.clientDao.getTest();
	}
}
