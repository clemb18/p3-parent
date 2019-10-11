package org.occ.bibliot.model.beans;

import javax.persistence.*;


@Entity
@Table(name="T_MEMBER")

public class Member extends User {


	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "M_NAME")
	private String name;

	@Column(name = "M_MAIL")
	private String mailAdress;


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
