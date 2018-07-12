package fr.gtm.project.proxibanque.persistence;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import fr.gtm.project.proxibanque.domain.Address;

@Named
@ApplicationScoped
public class AddressDao extends Repository<Address>  {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Address> findAll() {
		return this.findAll(Address.class);
	}

	@Override
	public Address findOne(Integer id) {
		return this.findOne(new Address(), id);
	}

}
