package com.example.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ClassroomDao;
import com.example.entity.Classroom;

@Service
public class ClassroomService {
	@Autowired
	ClassroomDao classroomDao;

	public ArrayList<Classroom> feachAllClassroom() {
		ArrayList<Classroom> clsList = classroomDao.feachAllClassroom();
		return clsList;
	}

	public ArrayList<Classroom> feachAllClassrooms() {
		return classroomDao.feachAllClassrooms();
	}

	public Classroom insertClassroom(Classroom classroom) throws ClassNotFoundException, SQLException {
		return classroomDao.insertClassroom(classroom);
	}

	public Classroom deleteClassroomPerId(Classroom classroom) throws ClassNotFoundException, SQLException {
		return classroomDao.insertClassroom(classroom);
	}

	public void deleteClassroomPerId(int clsId) {
		String sql = "delete from classroom where clsId = " + clsId;
		classroomDao.deleteClassroom(sql);
	}
}
