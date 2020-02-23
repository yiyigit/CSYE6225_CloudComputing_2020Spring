package com.csye6225.fall2019.courseservice.datamodel;

public class Lecture {
	private Long courseId;
	private Long lectureId;
	private String notes;
	private String material;
	
	public Lecture() {}
	

	
	public Lecture(Long courseId, Long lectureId, String notes, String material) {
		super();
		this.courseId = courseId;
		this.lectureId = lectureId;
		this.notes = notes;
		this.material = material;
	}



	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public Long getLectureId() {
		return lectureId;
	}

	public void setLectureId(Long lectureId) {
		this.lectureId = lectureId;
	}

	
}
