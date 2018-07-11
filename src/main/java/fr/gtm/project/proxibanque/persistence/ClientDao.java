package fr.gtm.project.proxibanque.persistence;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

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
	
	private String test ;

	public ClientDao() {
		this.test = "Affichage depuis le bean ClientDao !" ;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	} 
	
	
	
	

}
