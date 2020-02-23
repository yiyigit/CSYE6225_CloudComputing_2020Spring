package com.csye6225.fall2019.courseservice.resources;

import java.util.ArrayList;
import java.util.List;
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

import com.csye6225.fall2019.courseservice.datamodel.Student;
import com.csye6225.fall2019.courseservice.service.StudentsService;

@Path("students")
public class StudentResource {
	StudentsService stuService = new StudentsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents(){
		return stuService.getAllStudents();
	}
	
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudentsByProgram(
			@QueryParam("program") String program	){
		return stuService.getStudentsByProgram(program);
	}
	@GET
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudentsByID(
			@PathParam("studentId") Long studentId	){
		return stuService.getStudentsById(studentId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(Student stu) {
		stuService.addStudent(stu);
	}
	
	@PUT
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateStudent(
			@PathParam("studentId") long studentId, Student stu){
		stuService.updateStudent(studentId, stu);
	}
	
	@DELETE
	@Path("/{studentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student deleteStudent(
			@PathParam("studentId") long studentId) {
		return stuService.deleteStudent(studentId);
	}
}

