package com.virtusa.model;

import java.time.LocalDate;

public class ManagerModel {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private LocalDate date;
	private String venue;
	private String resultUpdate;
	public String getResultUpdate() {
		return resultUpdate;
	}
	public void setResultUpdate(String resultUpdate) {
		this.resultUpdate = resultUpdate;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(String interviewDate) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String interviewVenue) {
		this.venue = venue;
	}
	@Override
	public String toString() {
		return "ManagerModel [username=" + username + ", date=" + date + ", venue=" + venue + ", resultUpdate="
				+ resultUpdate + "]";
	}
	
	}
