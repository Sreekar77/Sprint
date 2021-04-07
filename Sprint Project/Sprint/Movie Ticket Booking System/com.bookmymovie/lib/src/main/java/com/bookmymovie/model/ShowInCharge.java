package com.bookmymovie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="showincharge")
public class ShowInCharge {
	
	@Id
	@GeneratedValue
	private String inchargeName;
	@Column
	private String password;
    @Column
	private String email;
	public String getInchargeName() {
		return inchargeName;
	}
	public void setInchargeName(String inchargeName) {
		this.inchargeName = inchargeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ShowInCharge(String inchargeName, String password, String email) {
		super();
		this.inchargeName = inchargeName;
		this.password = password;
		this.email = email;
	}
	
	public ShowInCharge() {
		
	}

}
