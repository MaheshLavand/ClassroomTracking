package com.example.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Classroom;
import com.example.service.ClassroomService;

@RestController
public class ClassroomController {
	@Autowired
	ClassroomService classroomService;
	
	@GetMapping("feachAllClassroom")
	public ArrayList<Classroom> feachAllClassroom(){
		ArrayList<Classroom> clsList = classroomService.feachAllClassroom();
		System.out.println(clsList);
		return clsList;
	}
	
	@PostMapping("insertAllClassroom")
	public Classroom insertClassroom(@RequestBody Classroom classroom) throws ClassNotFoundException, SQLException{
		return classroomService.insertClassroom(classroom); 
	}
	
	@GetMapping("feachAllClassrooms")
	public  ArrayList<Classroom> feachAllClassrooms( ) throws ClassNotFoundException, SQLException{
		return classroomService.feachAllClassrooms();
	}
	
	@DeleteMapping("deleteClassroomPerId")
	public void deleteClassroomPerId(int clsId) {
		classroomService.deleteClassroomPerId(clsId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@PostMapping("insertAllClassroom1")
	public Classroom insertClassroom1(@RequestBody Classroom classroom) {
//		return classroomService.insertClassroom(classroom);
		System.out.println(classroom);
		return classroom;
	}
}
