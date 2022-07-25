package com.rubixtek.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee empId;
	@Id
	private String date;
	@Column(name="in_time")
	private String inTime;
	@Column(name = "out_time")
	private String outTime;
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(Employee empId, String date, String inTime, String outTime) {
		super();
		this.empId = empId;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	public Employee getEmpId() {
		return empId;
	}
	public void setEmpId(Employee empId) {
		this.empId = empId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	
	
	
}
