package org.occ.p3.model;

import javax.annotation.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="borrow",schema="public")
public class Borrow implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "gen_borrow", strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "gen_borrow", allocationSize = 1)
	private Integer id;

	private String status; // ENCOURS RENDU PROLONGE

	private String workName;

	private Date startborrowdate;

	private Date endborrowdate;
	//@Nullable
	private boolean extended;

	//private Date currentdate;

	//@ManyToOne
	private Integer userRef;

	@OneToOne
	private Book book;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStartBorrowDate() {
		return startborrowdate;
	}

	public void setStartBorrowDate(Date startborrowdate) {
		this.startborrowdate = startborrowdate;
	}

	public Date getEndBorrowDate() {
		return endborrowdate;
	}

	public void setEndBorrowDate(Date endborrowdate) {
		this.endborrowdate = endborrowdate;
	}

	public boolean isExtended() {
		return extended;
	}

	public void setExtended(boolean extended) {
		this.extended = extended;
	}

	public Integer getUserRef() {
		return userRef;
	}

	public void setUserRef(Integer userRef) {
		this.userRef = userRef;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

    public void setMemberBorrowing(User membreTest) {
    }



	public void setWorkName(String workName) { this.workName = workName;
	}

	public String getWorkName() {
		return workName;
	}
}