package fr.gtm.project.proxibanque.persistence;

import java.util.List;

import fr.gtm.project.proxibanque.domain.Account;

public class AccountDao extends Repository <Account> {

	
	private static final long serialVersionUID = 1L;

	@Override
	public List<Account> findAll() {
		
		return this.findAll(Account.class);
	}

	@Override
	public Account findOne(Integer id) {
		
		return this.findOne(new Account(), id);
	}
	
	

}
