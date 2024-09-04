package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.entity.Classroom;
import com.example.utility.DatabaseUtility;

@Repository
public class ClassroomDao {

	public ArrayList<Classroom> feachAllClassroom() {
		ArrayList<Classroom> clsList = new ArrayList<Classroom>();
		Classroom classroom1 = new Classroom(101, "Java", 100, "200", 10);
		Classroom classroom2 = new Classroom(102, "Python", 150, "250", 5);

		clsList.add(classroom1);
		clsList.add(classroom2);
		return clsList;
	}

	public ArrayList<Classroom> feachAllClassrooms() {
		ArrayList<Classroom> clsList = new ArrayList<Classroom>();
		try {
			DatabaseUtility.loadDriver("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classroomspring";
			String username = "root";
			String password = "Mahi";
			Connection connection = DatabaseUtility.connectionEstablish(url, username, password);
			String query = "select * from classroom";
			PreparedStatement ps = DatabaseUtility.creatrSt(connection, query);
			ResultSet rs = DatabaseUtility.generateResultSet(ps);

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int capacity = rs.getInt(3);
				String size = rs.getString(4);
				int floor = rs.getInt(5);

				Classroom classroom = new Classroom(id, name, capacity, size, floor);
				clsList.add(classroom);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return clsList;
	}

	public Classroom insertClassroom(Classroom classroom) {
		try {
			DatabaseUtility.loadDriver("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classroomspring";
			String username = "root";
			String password = "Mahi";
			Connection connection = DatabaseUtility.connectionEstablish(url, username, password);
			String query = "insert into classroom(clsName,clsStudCapacity,areaSize,floor) values('"
					+ classroom.getClsName() + "','" + classroom.getClsStudCapacity() + "','" + classroom.getAreaSize()
					+ "','" + classroom.getFloor() + "')";
			PreparedStatement ps = DatabaseUtility.creatrSt(connection, query);
			ps.executeUpdate();
			System.out.println("Record Saved!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classroom;
	}

	public void deleteClassroom(String sql) {
		try {
			DatabaseUtility.loadDriver("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/classroomspring";
			String username = "root";
			String password = "Mahi";
			Connection connection = DatabaseUtility.connectionEstablish(url, username, password);
			String query = sql;
			PreparedStatement ps = DatabaseUtility.creatrSt(connection, query);
			ps.executeUpdate();
			System.out.println("Record Deleted!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
