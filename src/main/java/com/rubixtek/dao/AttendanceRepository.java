package com.rubixtek.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubixtek.entity.Attendance;
import com.rubixtek.entity.Employee;


public interface AttendanceRepository extends JpaRepository<Attendance, String> {
	public List<Attendance> findAllByOrderByDateAsc();
}
