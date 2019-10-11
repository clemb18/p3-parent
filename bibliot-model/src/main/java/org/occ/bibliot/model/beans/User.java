package org.occ.bibliot.model.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="T_USER")
@Inheritance(strategy = InheritanceType.JOINED)
public class User  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "U_ID")
	private Integer id;

	@Column(name = "U_USERNAME")
	private String username;

	@Column(name = "U_PASSWORD")
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
