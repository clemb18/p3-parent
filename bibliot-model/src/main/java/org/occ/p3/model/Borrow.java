package org.occ.p3.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="borrow")
public class Borrow  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(generator="gen_borrow", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="gen_borrow", sequenceName="seq_borrow", allocationSize=1)		
	private Integer id;	
	
	private Date startBorrowDate;
	
	private String status;//TODO: Faire une enum pour cela
	
	private Date endBorrowDate;
	
	private Boolean isExtended;

	@ManyToOne
	private Member memberBorrowing;
	
	@OneToOne
	private Book book;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartBorrowDate() {
		return startBorrowDate;
	}

	public void setStartBorrowDate(Date startBorrowDate) {
		this.startBorrowDate = startBorrowDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getEndBorrowDate() {
		return endBorrowDate;
	}

	public void setEndBorrowDate(Date endBorrowDate) {
		this.endBorrowDate = endBorrowDate;
	}

	public Member getMemberBorrowing() {
		return memberBorrowing;
	}

	public void setMemberBorrowing(Member memberBorrowing) {
		this.memberBorrowing = memberBorrowing;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getIsExtended() {
		return isExtended;
	}

	public void setIsExtended(Boolean isExtended) {
		this.isExtended = isExtended;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
