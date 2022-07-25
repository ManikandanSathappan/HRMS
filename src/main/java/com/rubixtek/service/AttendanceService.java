package com.rubixtek.service;

import java.util.List;

import com.rubixtek.entity.Attendance;
import com.rubixtek.entity.Employee;

public interface AttendanceService {
	public List<Attendance> findAll();
	
	public Attendance findById(String id);
	
	public void save(Attendance attendance);
	
	
}
