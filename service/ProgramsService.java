package com.csye6225.fall2019.courseservice.service;
import java.util.ArrayList;
import java.util.HashMap;
import com.csye6225.fall2019.courseservice.datamodel.Program;
import com.csye6225.fall2019.courseservice.datamodel.InMemoryDatabase;

public class ProgramsService {
	static private HashMap<Long, Program> program_Map = InMemoryDatabase.getProgramDB();
	
	public ArrayList<Program> getProgramList(){
		ArrayList<Program> list = new ArrayList<>();
		for(Program p: program_Map.values() ) {
			list.add(p);
		}
		return list;
	}
	public void addProgram(Program prog) {
		program_Map.put(prog.getProgramId(),prog);
	}
	public Program updateProgram(Long progId, Program prog) {
		program_Map.put(progId, prog);
		return program_Map.get(progId);
	}
	public Program deleteProgram(Long progId) {
		Program deleted = program_Map.get(progId);
		program_Map.remove(progId);
		return deleted;
	}
}
