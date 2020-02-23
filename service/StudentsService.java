package com.csye6225.fall2019.courseservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import com.csye6225.fall2019.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2019.courseservice.datamodel.Student;

public class StudentsService {
	static HashMap<Long, Student> stu_Map = InMemoryDatabase.getStudentDB();
	public ArrayList<Student> getAllStudents(){
		ArrayList<Student> list = new ArrayList<>();
		for(Student stu : stu_Map.values()) {
			list.add(stu);
		}return list;
	}
	public ArrayList<Student> getStudentsByProgram(String program){
		ArrayList<Student> list = new ArrayList<>();
		for(Student stu : stu_Map.values()) {
			if(stu.getProgram().equals(program)) {
				list.add(stu);
			}
		}return list;
	}
	public Student getStudentsById(Long studentId) {
		return stu_Map.get(studentId);
			
	}
	
	public void addStudent(Student stu) {
		Long nextStuId = 0001L;
		for(Long stuId:stu_Map.keySet()) {
			if (stuId > nextStuId) {
				nextStuId = stuId + 1;
			}
		}
		stu.setStudentId(nextStuId);
		stu_Map.put(stu.getStudentId(), stu);
	}
	public void updateStudent(Long stuId, Student stu) {
		stu_Map.put(stuId, stu);
	}
	
	public Student deleteStudent(Long stuId) {
		Student deleted = stu_Map.get(stuId);
		stu_Map.remove(stuId);
		return deleted;
		
	}
	
}
