package org.occ.p3.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="member")
@PrimaryKeyJoinColumn(name = "id")
public class Member extends User {

	@Id
    @GeneratedValue(generator="gen_member", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="gen_member", sequenceName="seq_member", allocationSize=1)		
	private Integer id;	
	
	private String name;
	
	private String userName;

	@OneToMany
	private List<Borrow> borrowList;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


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
