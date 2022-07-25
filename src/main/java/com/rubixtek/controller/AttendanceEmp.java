package com.rubixtek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rubixtek.entity.Attendance;
import com.rubixtek.entity.Employee;
import com.rubixtek.service.AttendanceService;
import com.rubixtek.service.EmployeeService;

@Controller
@RequestMapping("/attendance")
public class AttendanceEmp {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private AttendanceService attendanceService;

	@GetMapping("/em")
	public String employeee(Model model) {
		// Delete the employee record
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		UserDetails userDetails = (UserDetails) authentication.getPrincipal();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String userName = userDetails.getUsername();
		System.out.println("Logged in username is " + userName);
		Employee user = employeeService.findById(userName);

		model.addAttribute("user", user);
		Attendance attendance = new Attendance();

		model.addAttribute("attendance", attendance);
		return "employee";
	}
	@PostMapping("/save")
	public String attendance(@ModelAttribute("attendance") Attendance attendance) {
		attendanceService.save(attendance);
		
		return "redirect:/attendance/em";
	}
	

}
