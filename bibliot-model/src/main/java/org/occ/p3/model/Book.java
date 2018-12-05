package org.occ.p3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	
	@Id
    @GeneratedValue(generator="gen_book", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="gen_book", sequenceName="seq_book", allocationSize=1)		
	private Integer id;	

	private Boolean isAvailable;
	
	@ManyToOne
	private Work originWork;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Work getOriginWork() {
		return originWork;
	}

	public void setOriginWork(Work originWork) {
		this.originWork = originWork;
	}
	
	
	
}
