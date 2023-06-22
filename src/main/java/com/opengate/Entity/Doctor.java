package com.opengate.Entity;

public class Doctor {

	// Long id;
	private String name;
	private String lastName;
	private String fiscalCode;
	private String phoneNumber;
	private String workTime;
	private String imageUrl;
	private String email;

	public Doctor(String name, String lastName, String fiscalCode, String phoneNumber, String workTime, String imageUrl,
			String email) {
		this.name = name;
		this.lastName = lastName;
		this.fiscalCode = fiscalCode;
		this.phoneNumber = phoneNumber;
		this.workTime = workTime;
		this.imageUrl = imageUrl;
		this.email = email;
	}

	public Doctor() {
		
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

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
