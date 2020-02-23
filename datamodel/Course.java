package com.csye6225.fall2019.courseservice.datamodel;

public class Course {
	private Long courseId;
	private String courseName;
	private String program;
	private Lecture lectures;
	private Board board;
	private Roster roster;
	private Professor prof;
	private Student TA;
	
	public Course(){}
	
	public Course(Long courseId, String courseName, String program,  Lecture lectures,
			Board board, Roster roster , Professor prof,
			Student tA) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.program = program;
		this.lectures = lectures;
		this.board = board;
		this.roster = roster;
		this.prof = prof;
		TA = tA;
	}



	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	public Lecture getLectures() {
		return lectures;
	}
	public void setLectures(Lecture lectures) {
		this.lectures = lectures;
	}
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public Roster getRoster() {
		return roster;
	}
	public void setRoster(Roster roster) {
		this.roster = roster;
	}
	
	public Professor getProf() {
		return prof;
	}
	public void setProf(Professor prof) {
		this.prof = prof;
	}
	public Student getTA() {
		return TA;
	}
	public void setTA(Student tA) {
		TA = tA;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	
}
