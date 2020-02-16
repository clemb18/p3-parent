package com.openclassrooms.bibliotheque.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "T_BORROW")
public class Borrow implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "B_ID")
	private Long id;
	@Column(name = "B_STATUS")
	private String status;
	@Column(name = "B_START_BORROW_DATE")
	private Date startBorrowDate;
	@Column(name = "B_END_BORROW_DATE")
	private Date endBorrowDate;
	@Column(name = "B_EXTENDED")
	private boolean extended;
	@Column(name = "B_WORK_TITLE")
	public String workTitle;

	public String getWorkName() {
		return workTitle;
	}

	public void setWorkName(String workName) {
		this.workTitle = workName;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="B_MEMBER_ID")
	private Member member;

	@OneToOne
	@JoinColumn(name = "B_BOOK_ID", referencedColumnName = "BOOK_ID")
	private Book book;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartBorrowDate() {
		return startBorrowDate;
	}

	public void setStartBorrowDate(Date startBorrowDate) {
		this.startBorrowDate = startBorrowDate;
	}

	public Date getEndBorrowDate() {
		return endBorrowDate;
	}

	public void setEndBorrowDate(Date endBorrowDate) {
		this.endBorrowDate = endBorrowDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public boolean isExtended() {
		return extended;
	}

	public void setExtended(boolean extended) {
		this.extended = extended;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}