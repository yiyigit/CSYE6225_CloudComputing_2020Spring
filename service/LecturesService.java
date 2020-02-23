package com.csye6225.fall2019.courseservice.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.csye6225.fall2019.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2019.courseservice.datamodel.Lecture;

public class LecturesService {
	static HashMap<Long, ArrayList<Lecture>> lecture_Map = InMemoryDatabase.getLectureDB();
	
	public ArrayList<Lecture> getAllLectures() {
		ArrayList<Lecture> list = new ArrayList<>();
		for (ArrayList<Lecture> l: lecture_Map.values()) {
			list.addAll(l);
	}
		return list;
	}
	
	public ArrayList<Lecture> getLecturesByCourse(Long courseId) {
		return lecture_Map.get(courseId);
	}
	
	public void addLecture(Lecture l) {
		if(lecture_Map.get(l.getCourseId()) != null) {
			ArrayList<Lecture> list = lecture_Map.get(l.getCourseId());	
			list.add(l);
			lecture_Map.put(l.getCourseId(),list);
		}
		else {
			ArrayList<Lecture> list = new ArrayList<>();
			list.add(l);
			lecture_Map.put(l.getCourseId(),list);
		}
	}
	
	public void updateLecture(Long courseId, Long lectureId, Lecture l) {
		ArrayList<Lecture> list = lecture_Map.get(courseId);
		for (Lecture lecture:list) {
			if(lecture.getLectureId() == lectureId) {
				int index = list.indexOf(lecture);
				list.set(index, l);
			}
		}
		
	}
	
	public Lecture deleteLecture(Long courseId, Long lectureId) {
		ArrayList<Lecture> list = lecture_Map.get(courseId);
		for (Lecture lecture:list) {
			if(lecture.getLectureId() == lectureId) {
				int index = list.indexOf(lecture);
				Lecture deleted = lecture;
				list.remove(index);
				return deleted;
			}
		}return new Lecture();
		
	}

}
