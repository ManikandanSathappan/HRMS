package com.rubixtek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubixtek.dao.AttendanceRepository;
import com.rubixtek.dao.EmployeeRepository;
import com.rubixtek.entity.Attendance;
import com.rubixtek.entity.Employee;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	private AttendanceRepository attendanceRepository;
	
	@Autowired
	public AttendanceServiceImpl(AttendanceRepository theAttendanceRepository) {
		attendanceRepository = theAttendanceRepository;
	}
	
	@Override
	public List<Attendance> findAll() {
		return attendanceRepository.findAllByOrderByDateAsc();
	}

	@Override
	public Attendance findById(String id) {
		Optional<Attendance> result = attendanceRepository.findById(id);
		
		Attendance employee = null;
		// Check if the employee exists
		if (result.isPresent()) {
			employee = result.get();
		} else {
			throw new RuntimeException("Unable to find the employee id - " + id);
		}
		
		return employee;
	}

	@Override
	public void save(Attendance attendance) {
		attendanceRepository.save(attendance);
	}


	

}

