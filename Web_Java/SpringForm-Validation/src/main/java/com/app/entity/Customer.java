package com.app.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.Size;

public class Customer {
	private String firstName;
	@NonNull
	@Size(min = 1, message = "Bsdk 1 lastName to dal")
	private String lastName;

	public Customer() {
	}

	public Customer(String firstName, @Size(min = 1, message = "Enter At least 1 Character") String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
