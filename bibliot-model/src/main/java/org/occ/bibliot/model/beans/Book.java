package org.occ.bibliot.model.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="book")
public class Book implements Serializable {

	@Id
	@GeneratedValue(generator="gen_book", strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="gen_book", sequenceName="seq_book", allocationSize=1)
	private Integer id;

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
