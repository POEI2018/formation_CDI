package fr.gtm.project.proxibanque.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Account implements HbEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Float balance;
	private String type;
	private String number;
	private String label;
	private LocalDate openedOn;
	
	@OneToOne
	@JoinColumn(name = "bankCard_id", referencedColumnName="id")
	private BankCard bankCard;
	
	@OneToOne
	@JoinColumn(name = "checkBook_id", referencedColumnName="id")
	private CheckBook checkBook;
	
	@ManyToOne
	@JoinColumn(name="id_Client", referencedColumnName="id_client")
	private Client client;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public TYPE_COMPTE getType() {
		return TYPE_COMPTE.valueOf(this.type);
	}

	public void setType(TYPE_COMPTE type) {
		this.type = type.name();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public LocalDate getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(LocalDate openedOn) {
		this.openedOn = openedOn;
	}

	// public BankCard getBankCard() {
	// return bankCard;
	// }
	//
	// public void setBankCard(BankCard bankCard) {
	// this.bankCard = bankCard;
	// }
	//
	// public CheckBook getCheckBook() {
	// return checkBook;
	// }
	//
	// public void setCheckBook(CheckBook checkBook) {
	// this.checkBook = checkBook;
	// }
	//
	// public Client getClient() {
	// return client;
	// }
	//
	// public void setClient(Client client) {
	// this.client = client;
	// }

}