package com.app.entity;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue
	@Cloumn(namwe="id")
	private int id;
	@Column(name="first_name")
	private String firstaName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	
	public Customer() {}

	public Customer(int id, String firstaName, String lastName, String email) {
		super();
		this.id = id;
		this.firstaName = firstaName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstaName() {
		return firstaName;
	}

	public void setFirstaName(String firstaName) {
		this.firstaName = firstaName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstaName=" + firstaName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	
}
