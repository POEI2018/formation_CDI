package fr.gtm.project.proxibanque.persistence;

import java.util.List;

import fr.gtm.project.proxibanque.domain.CheckBook;

public class CheckBookDao extends Repository<CheckBook> {


	private static final long serialVersionUID = 1L;

	@Override
	public List<CheckBook> findAll() {
		
		return this.findAll(CheckBook.class);
	}

	@Override
	public CheckBook findOne(Integer id) {
		
		return this.findOne(new CheckBook(),id);
	}
	
	

}
