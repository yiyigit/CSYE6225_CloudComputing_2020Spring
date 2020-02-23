package com.csye6225.fall2019.courseservice.datamodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InMemoryDatabase {

	private static HashMap<Long, Professor> professorDB = new HashMap<>();
	private static HashMap<Long, Student> studentDB = new HashMap<>();
	private static HashMap<Long, Course> courseDB = new HashMap<>();
	private static HashMap<Long, Program> programDB = new HashMap<>();
	private static HashMap<Long, ArrayList<Lecture>> lectureDB = new HashMap<>();
	private static Professor prof1 = new Professor ((long)0001, "Brett", "Blue","IS","9/1/2011");
	private static Professor prof2 = new Professor ((long)0002, "April", "Bingham","CS","11/21/2014");
	private static Student stu1 = new Student(201901L, "Yiyi", "Zhou", "IS", new ArrayList<String>(Arrays.asList("csye5226","info5100")));
	private static Board board1 = new Board("Announce: Today's class is canceled due to President's Day!");
	private static Lecture lecture1 = new Lecture(5200L,0001L,"notes1","material1");
	private static Roster roster1 = new Roster(5200L,new ArrayList<Long>(Arrays.asList(201901L,201902L)));
	private static Course course1 = new Course(5200L,"web tool","IS",lecture1, board1,roster1, prof1, stu1);
	private static Program program1 = new Program(0001L,"IS",new ArrayList<String>(Arrays.asList("info4250","info5100","info5200","info6500")));
	
	InMemoryDatabase(){}
	
	public static HashMap<Long, Professor> getProfessorDB() {
		professorDB.put((long)0001,prof1);
		professorDB.put((long)0002,prof2);
		return professorDB;
	}	
	
	public static HashMap<Long, Student> getStudentDB(){
		studentDB.put(201901L,stu1);
		return studentDB;
	}
	
	public static HashMap<Long, Course> getCourseDB(){
		courseDB.put(5200L, course1);
		return courseDB;
	}
	public static HashMap<Long, Program> getProgramDB(){
		programDB.put(0001L,program1);
		return programDB;
	}
	
	public static HashMap<Long, ArrayList<Lecture>> getLectureDB(){
		ArrayList<Lecture> lectures  =new ArrayList<Lecture>();
		lectures.add(lecture1);
		lectureDB.put(5200L, lectures);
		System.out.println(lectureDB);
		return lectureDB;
	}
}