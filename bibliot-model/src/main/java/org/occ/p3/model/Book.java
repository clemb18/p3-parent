package org.occ.p3.model;




import javax.annotation.Nullable;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="book", schema="public")
public class Book implements Serializable {
	
	@Id
    @GeneratedValue(generator="gen_book", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="gen_book", allocationSize=1)
	private Integer id;

	//@Nullable
	private boolean available;

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	
	//@ManyToOne
	//private Work originWork;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	//public Work getOriginWork() {
	//	return originWork;
	//}

	//public void setOriginWork(Work originWork) {
	//	this.originWork = originWork;
	//}



}
