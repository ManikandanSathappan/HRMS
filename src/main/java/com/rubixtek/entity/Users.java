package com.rubixtek.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	private String username;
	private String password;
	private boolean enabled;
	
	@OneToOne
	private Employee employee;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String username, String password, boolean enabled, Employee employee) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.employee = employee;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
	
} 
