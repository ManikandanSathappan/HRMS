package com.rubixtek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubixtek.dao.EmployeeRepository;
import com.rubixtek.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAllByOrderByIdAsc();
	}

	@Override
	public Employee findById(String id) {
		Optional<Employee> result = employeeRepository.findById(id);
		
		Employee employee = null;
		// Check if the employee exists
		if (result.isPresent()) {
			employee = result.get();
		} else {
			throw new RuntimeException("Unable to find the employee id - " + id);
		}
		
		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(String id) {		
		employeeRepository.deleteById(id);
	}

	@Override
	public List<Employee> findByKeyword(String keyword) {
		return employeeRepository.findByKeyword(keyword);
	}

}
