package org.occ.p3.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="member")
@PrimaryKeyJoinColumn(name = "id")
public class Member extends User {


	private String name;

	private String mail;

	private String city;

	private String postCode;

	private String firstName;

	private String nickName;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch= FetchType.EAGER)
	//@LazyCollection(LazyCollectionOption.FALSE)
	private List<Borrow> borrowList;

	public List<Borrow> getBorrowList() {
		return borrowList;
	}


	public void setBorrowList(List<Borrow> borrowList) {
		this.borrowList = borrowList;
	}
	
	
}
