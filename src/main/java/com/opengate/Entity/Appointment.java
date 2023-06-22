package com.opengate.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Appointment {

	// Long id;
	// User user;
	// Doctor doctor;

	private LocalDate dayOfWeek;
	// private LocalDateTime time;
	private String description;
	private LocalTime time;



	public Appointment() {
	}

	public LocalDate getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(LocalDate dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	
	
	

}
