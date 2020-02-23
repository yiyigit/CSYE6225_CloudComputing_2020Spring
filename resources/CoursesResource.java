package com.csye6225.fall2019.courseservice.resources;

import java.util.List;
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
import com.csye6225.fall2019.courseservice.service.CoursesService;

@Path("courses")
public class CoursesResource {

		CoursesService coursesService = new CoursesService();

		@GET			
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<Course> getCourses() {			
			return coursesService.getAllCourses();
		}	
		// ... webapi/courses/query?program=IS
		@GET
		@Path("/query")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Course> getCoursesByProgram(
				@QueryParam("program") String program			) {			
			if (program == null) {
				return coursesService.getAllCourses();
			}
			return coursesService.getCoursesByProgram(program);			
		}
		
		// ... webapi/courses/6225
		@GET
		@Path("/{courseId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Course getCourseDetails(@PathParam("courseId") Long courseId) {
			return coursesService.getCourseDetails(courseId);
		}
	
	
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public void addNewCourse(Course course) {
				coursesService.addNewCourse(course);
		}

		@PUT
		@Path("/{courseId}")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public void updateCourse(@PathParam("courseId") long courseId, 
				Course c) {
			 coursesService.updateCourseInformation(courseId, c);
		}
	
		@DELETE
		@Path("/{courseId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Course deleteCourse(@PathParam("courseId") long courseId) {
			return coursesService.deleteCourse(courseId);
		}

}
