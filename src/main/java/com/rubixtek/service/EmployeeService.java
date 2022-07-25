package com.rubixtek.service;

import java.util.List;

import com.rubixtek.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(String id);
	
	public void save(Employee employee);
	
	public void deleteById(String id);
	
	public List<Employee> findByKeyword(String keyword);

}
