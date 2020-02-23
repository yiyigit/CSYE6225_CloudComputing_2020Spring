package com.csye6225.fall2019.courseservice.datamodel;
import java.util.ArrayList;

public class Program {
	private Long programId;
	private String programName;
	private ArrayList<String> coursesName;
	
	public Program() {}
	
	public Program(Long programId, String programName, ArrayList<String> coursesName) {
		super();
		this.programId = programId;
		this.programName = programName;
		this.coursesName = coursesName;
	}

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
		this.programId = programId;
	}
	
	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public ArrayList<String> getCoursesName() {
		return coursesName;
	}

	public void setCoursesName(ArrayList<String> coursesName) {
		this.coursesName = coursesName;
	}




	
}
