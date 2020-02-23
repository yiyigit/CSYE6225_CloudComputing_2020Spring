package com.csye6225.fall2019.courseservice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
//import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedQueryList;
//import com.csye6225.fall2019.courseservice.datamodel.DynamoDbConnector;
import com.csye6225.fall2019.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2019.courseservice.datamodel.Professor;

public class ProfessorsService {
	
	static HashMap<Long, Professor> prof_Map = InMemoryDatabase.getProfessorDB();

	
	//default constructor
	public ProfessorsService() {
	}
	

	public List<Professor> getAllProfessors() {	

		ArrayList<Professor> list = new ArrayList<>();
		for (Professor prof : prof_Map.values()) {
			list.add(prof);
		}
		
		return list ;
	}

	public List<Professor> getProfessorsByDepartment(String department) {	

		ArrayList<Professor> departmentProfList = new ArrayList<>();
		for (Professor prof : prof_Map.values()) {
			if (prof.getDepartment().equals(department)) {
				departmentProfList.add(prof);
			}
		}
		return departmentProfList ;
	}

	
	public void addProfessor(Professor prof) {
		prof_Map.put(prof.getProfessorId(), prof);
	}
	
	// Getting One Professor
	public Professor getProfessor(Long profId) {

		 Professor prof2 = prof_Map.get(profId);
	     System.out.println("Item retrieved:");
	     System.out.println(prof2.toString());
		
		return prof2;
	}
	
	// Deleting a professor
	public Professor deleteProfessor(Long profId) {
		Professor deletedProfDetails = prof_Map.get(profId);
		prof_Map.remove(profId);
		return deletedProfDetails;
	}
	
	// Updating Professor Info
	public Professor updateProfessorInformation(Long profId, Professor prof) {	
		prof_Map.put(profId, prof);
		prof.setProfessorId(profId);
		return prof;
	}

}

