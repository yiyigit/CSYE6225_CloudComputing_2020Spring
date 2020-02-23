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

import com.csye6225.fall2019.courseservice.datamodel.Program;
import com.csye6225.fall2019.courseservice.service.ProgramsService;

@Path("programs")
public class ProgramsResource {
	ProgramsService programs_service = new ProgramsService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Program> getAllPrograms(){
		return programs_service.getProgramList();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void addNewProgram(Program p) {
		programs_service.addProgram(p);
	}
	@PUT
	@Path("/{programId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Program updateProgram(
			@PathParam("programId") Long programId, Program p) {
		return programs_service.updateProgram(programId, p);
	}
	
	
	@DELETE
	@Path("/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Program deleteProgram(
			@PathParam("programId") Long programId) {
		return programs_service.deleteProgram(programId);
	}
	


}
