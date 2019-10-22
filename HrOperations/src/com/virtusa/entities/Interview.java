package com.virtusa.entities;

import java.time.LocalDate;

public class Interview {

	private String interviewerId;
	private LocalDate date;
	private String venue;
	@Override
	public String toString() {
		return "Interview [interviewerId=" + interviewerId + ", date=" + date + ", venue=" + venue + "]";
	}
	public String getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(String interviewerId) {
		this.interviewerId = interviewerId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	
}
