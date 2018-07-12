package fr.gtm.project.proxibanque.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements HbEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String country;
	private String city;
	private String postalCode;
	private String mainLine;
	private String optionalLine;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getMainLine() {
		return mainLine;
	}

	public void setMainLine(String mainLine) {
		this.mainLine = mainLine;
	}

	public String getOptionalLine() {
		return optionalLine;
	}

	public void setOptionalLine(String optionalLine) {
		this.optionalLine = optionalLine;
	}

}