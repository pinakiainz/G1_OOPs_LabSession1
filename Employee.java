package com.greatlearning.model;

public class Employee {
	
	private String Fname;
	private String Lname;
	private String email;
	private String password;
	public Employee(String fname, String lname) {
		super();
		this.Fname = fname;
		this.Lname = lname;
		
		
			
		
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
