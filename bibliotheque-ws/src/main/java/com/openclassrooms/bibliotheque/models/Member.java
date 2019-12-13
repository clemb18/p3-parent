package com.openclassrooms.bibliotheque.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name="T_MEMBER")

public class Member implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "M_ID")
	private Long id;

	@Column(name = "M_MAIL")
	private String mailAdress;

	@Column(name = "M_NAME")
	private String name;

	@Column(name = "M_FIRST_NAME")
	private String firstName;

	@Column(name = "M_TEL")
	private String tel;

	@Column(name = "M_ADRESS")
	private String adress;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public String getMailAdress() {
		return mailAdress;
	}


	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}


}
