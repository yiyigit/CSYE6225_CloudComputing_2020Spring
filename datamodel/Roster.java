package com.csye6225.fall2019.courseservice.datamodel;
import java.util.ArrayList;

public class Roster {
	private Long rosterId;
	private ArrayList<Long> studentId;
	
	public Roster() {}
	public Roster(Long rosterId, ArrayList<Long> studentId) {
		super();
		this.rosterId = rosterId;
		this.studentId = studentId;
	}
	public Long getRosterId() {
		return rosterId;
	}
	public void setRosterId(Long rosterId) {
		this.rosterId = rosterId;
	}
	public ArrayList<Long> getStudentId() {
		return studentId;
	}
	public void setStudentId(ArrayList<Long> studentId) {
		this.studentId = studentId;
	}
	
}
