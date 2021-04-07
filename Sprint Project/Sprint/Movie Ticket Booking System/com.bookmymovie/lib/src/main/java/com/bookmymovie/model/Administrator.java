package com.bookmymovie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administrator")
public class Administrator {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adminId;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String access;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	
	public Administrator(int adminId, String email, String password, String access) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.password = password;
		this.access = access;
	}
	
	public Administrator() {
		
	}
	@Override
	public String toString() {
		return "Administrator [adminId=" + adminId + ", email=" + email + ", password=" + password + ", access="
				+ access + "]";
	}

}
