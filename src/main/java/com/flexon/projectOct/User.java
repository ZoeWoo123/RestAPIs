package com.flexon.projectOct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class User {
	
//	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(min=1, message="Lastname should have more than one character!")
	private String firstName;
	@Size(min=1, message="Lastname should have more than one character!")
	private String lastName;
	private String phoneNum;
	private String emailAdd;
	@Size(min=6, message="Password should at least contains 6 character!")
	private String password;
	
	public User() {
		
	}
	public User(String f, String l, String p, String e, String pass) {
		this.firstName = f;
		this.lastName = l;
		this.phoneNum = p;
		this.emailAdd = e;
		this.password = pass;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
