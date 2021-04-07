package com.bookmymovie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
		@Id
		@Column(length = 20)
		private String customername;
		@Column(length = 15)
		private String password;
		@Column(length = 30)
		private String Email;
		@Column(length = 10)
		private String Phoneno;

		public Customer(String customername, String password, String email, String phoneno) {
			super();
			this.customername = customername;
			this.password = password;
			Email = email;
			Phoneno = phoneno;
		}

		public Customer() {

		}

		public String getPhoneno() {
			return Phoneno;
		}

		public void setPhoneno(String phoneno) {
			Phoneno = phoneno;
		}

		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}


}
