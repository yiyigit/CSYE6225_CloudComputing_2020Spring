package com.csye6225.fall2019.courseservice.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.csye6225.fall2019.courseservice.datamodel.Course;
import com.csye6225.fall2019.courseservice.datamodel.Lecture;
import com.csye6225.fall2019.courseservice.service.LecturesService;

@Path("lectures")
public class LecturesResource {
	LecturesService lecturesService = new LecturesService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Lecture> getAllLectures() {
		return lecturesService.getAllLectures();
	}
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Lecture> getLecturesByCourse(
			@QueryParam("courseId") Long courseId){
		return lecturesService.getLecturesByCourse(courseId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addLecture(Lecture l) {
		lecturesService.addLecture(l);
	}
	
	@PUT
	@Path("/{courseId}/{lectureId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void updateLecture(@PathParam("courseId") long courseId, @PathParam("lectureId") long lectureId,
			Lecture l) {
		 lecturesService.updateLecture(courseId,lectureId, l);
	}
	
	@DELETE
	@Path("/{courseId}/{lectureId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture deleteLecture(@PathParam("courseId") long courseId, @PathParam("lectureId") long lectureId) {
		 return lecturesService.deleteLecture(courseId,lectureId);
	}
}
