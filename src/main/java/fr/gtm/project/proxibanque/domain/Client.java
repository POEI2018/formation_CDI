package fr.gtm.project.proxibanque.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client implements HbEntity{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_client")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	
	private String lastname ;
	private String firstname ; 
	private LocalDate birthDate ;
	private String number ;
	
	@OneToOne
	@JoinColumn(name = "adress_id", referencedColumnName="id")
	private Address address ; 
	
	@OneToMany(mappedBy="client")
	private List<Account> account; 
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
	
	
	

}
