package fr.gtm.project.proxibanque.persistence;

import java.util.List;

import fr.gtm.project.proxibanque.domain.BankCard;

public class BankCardDao extends Repository<BankCard> {

	private static final long serialVersionUID = 1L;

	@Override
	public List<BankCard> findAll() {
	
		return this.findAll(BankCard.class);
	}

	@Override
	public BankCard findOne(Integer id) {
		
		return this.findOne(new BankCard(), id);
	}
	
	

}
