package com.csye6225.fall2019.courseservice.datamodel;
import java.util.ArrayList;

public class Student {

		private Long studentId;
		private String firstName;
		private String lastName;
		private String programName;
		private ArrayList<String> coursesRegisted;
		
		public Student() {}
		
		public Student(Long studentId) {

			this.studentId = studentId;
		}

		public Student(Long studentId, String firstName, String lastName, String programName) {
			super();
			this.studentId = studentId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.programName = programName;
		}

		public Student(Long studentId, String firstName, 
				String lastName, String program, ArrayList<String> coursesName) {

			this.studentId = studentId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.programName = program;
			this.coursesRegisted = coursesName;
		}
		
		public Long getStudentId() {
			return studentId;
		}
		public void setStudentId(Long studentId) {
			this.studentId = studentId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getProgram() {
			return programName;
		}
		public void setProgram(String program) {
			this.programName = program;
		}

		public ArrayList<String> getCoursesId() {
			return coursesRegisted;
		}

		public void setCoursesId(ArrayList<String> coursesName) {
			this.coursesRegisted = coursesName;
		}




}
