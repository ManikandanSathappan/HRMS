package com.rubixtek.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authority {
	
	@Id
	private String authorityId;
	@OneToOne
	@JoinColumn(name = "username")
	private Users username;
	private String authority;
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Authority(String authorityId, Users username, String authority) {
		super();
		this.authorityId = authorityId;
		this.username = username;
		this.authority = authority;
	}
	public String getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}
	public Users getUsername() {
		return username;
	}
	public void setUsername(Users username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}