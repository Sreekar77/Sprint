package com.bookmymovie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theatre")
public class Theatre {
	
	@Id
	@GeneratedValue
	private int theatreid;
	@Column
	private String theatrename;
	@Column
	private String theatrecity;
	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}
	public String getTheatrename() {
		return theatrename;
	}
	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}
	public String getTheatrecity() {
		return theatrecity;
	}
	public void setTheatrecity(String theatrecity) {
		this.theatrecity = theatrecity;
	}
	public Theatre(int theatreid, String theatrename, String theatrecity) {
		super();
		this.theatreid = theatreid;
		this.theatrename = theatrename;
		this.theatrecity = theatrecity;
	}
	public Theatre() {
		
	}

}
