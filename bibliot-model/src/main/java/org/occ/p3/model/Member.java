package org.occ.p3.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="member")
@PrimaryKeyJoinColumn(name = "id")
public class Member extends User {


	private String name;
	
	private String userName;

	@OneToMany
	private List<Borrow> borrowList;



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public List<Borrow> getBorrowList() {
		return borrowList;
	}


	public void setBorrowList(List<Borrow> borrowList) {
		this.borrowList = borrowList;
	}
	
	
}
