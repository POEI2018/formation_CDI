package fr.gtm.project.proxibanque.Business;

import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import fr.gtm.project.proxibanque.domain.Client;

@Named
@ApplicationScoped
public class DefaultCreateClient {
	
	@Inject
	ClientService clientService ; 
	
	public String test() {
		final Client client = new Client("lolo") ;
		client.setLastname("momo");
		client.setBirthDate(LocalDate.of(1990,12,19));
		client.setNumber("00004569");
		this.clientService.create(client);
		if(client.getId() != null)
		   return "test success !" ;
		else 
			return "test Failed !" ;
		
	}

}
