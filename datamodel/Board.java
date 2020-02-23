package com.csye6225.fall2019.courseservice.datamodel;

public class Board {
	private String announcement;
	
	public Board() {}
	public Board(String announcement) {
		super();
		this.announcement = announcement;
	}

	public String getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}
}
