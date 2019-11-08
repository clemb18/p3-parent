package org.openclassroom.bibliot.model.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="T_BOOK")
public class Book implements Serializable {

	@Id

	@Column(name = "BOOK_ID")
	private Integer id;
	@Column(name = "BOOK_AVAILABLE")
	private boolean available;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", available=" + available +
				'}';
	}
}
