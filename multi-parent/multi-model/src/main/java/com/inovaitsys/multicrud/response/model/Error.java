package com.inovaitsys.multicrud.response.model;

public class Error {
	
	private String details;
	private String title;
	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Error(String details, String title) {
		super();
		this.details = details;
		this.title = title;
	}

	
	
	

}
