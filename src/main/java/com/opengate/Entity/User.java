package com.opengate.Entity;

import java.util.Date;

public class User {

	private String name;
	private String lastName;
	private String email;
	private String fiscalCode;
	private String phoneNumber;
	private Date birth;

	public User(String name, String lastName, String email, String fiscalCode, String phoneNumber, Date birth) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.fiscalCode = fiscalCode;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
