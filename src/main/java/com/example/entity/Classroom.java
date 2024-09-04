package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Classroom {

	int clsId;
	String clsName;
	int clsStudCapacity;
	String areaSize;
	int floor;
	public Classroom() {
		super();
	}
	public Classroom(int clsId, String clsName, int clsStudCapacity, String areaSize, int floor) {
		super();
		this.clsId = clsId;
		this.clsName = clsName;
		this.clsStudCapacity = clsStudCapacity;
		this.areaSize = areaSize;
		this.floor = floor;
	}
	
	public Classroom(String clsName, int clsStudCapacity, String areaSize, int floor) {
		super();
		this.clsName = clsName;
		this.clsStudCapacity = clsStudCapacity;
		this.areaSize = areaSize;
		this.floor = floor;
	}
	public int getClsId() {
		return clsId;
	}
	public void setClsId(int clsId) {
		this.clsId = clsId;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public int getClsStudCapacity() {
		return clsStudCapacity;
	}
	public void setClsStudCapacity(int clsStudCapacity) {
		this.clsStudCapacity = clsStudCapacity;
	}
	public String getAreaSize() {
		return areaSize;
	}
	public void setAreaSize(String areaSize) {
		this.areaSize = areaSize;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	@Override
	public String toString() {
		return "Classroom [clsId=" + clsId + ", clsName=" + clsName + ", clsStudCapacity=" + clsStudCapacity
				+ ", areaSize=" + areaSize + ", floor=" + floor + "]";
	}
	
	
}
