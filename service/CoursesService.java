package com.csye6225.fall2019.courseservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.csye6225.fall2019.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2019.courseservice.datamodel.Program;
import com.csye6225.fall2019.courseservice.datamodel.Course;

public class CoursesService {
	static HashMap<Long, Course> course_Map = InMemoryDatabase.getCourseDB();
	
public CoursesService() {}

public ArrayList<Course> getAllCourses(){
	ArrayList<Course> list = new ArrayList<>();
	for (Course course : course_Map.values()) {
		list.add(course);
	}	
	return list ;
}

public List<Course> getCoursesByProgram(String program){
	ArrayList<Course> list = new ArrayList<>();
	for(Course course: course_Map.values()) {
		if (course.getProgram().equals(program)) {
			list.add(course);
		}
	}
	return list;
}

public Course getCourseDetails(Long courseId) {
	for (Course course: course_Map.values()) {
		if(course.getCourseId().equals(courseId)) {
			return course;
		}
	}return new Course();
}

public void addNewCourse(Course c) {
	course_Map.put(c.getCourseId(), c);
}

public void updateCourseInformation(Long courseId, Course c) {
	course_Map.put(courseId,  c);
}

public Course deleteCourse(Long courseId) {
	Course deleted = course_Map.get(courseId);
	course_Map.remove(courseId);
	return deleted;
}
}
