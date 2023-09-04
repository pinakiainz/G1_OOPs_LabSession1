package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeCredentialsimpl implements EmployeeCredentials {

	@Override
	public String generateemail(String Fname, String Lname, String Department) {
		
	return Fname+Lname+"@"+Department+".abc.com";
	}

	@Override
	public String generatepassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="1234567890";
		String splchars="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchars;  //72 chars
		String pass="";
		Random random=new Random();
		for(int i=0;i<8;i++)
		{
		pass=pass+String.valueOf(combined.charAt(random.nextInt(combined.length()))); 
		}
		return pass;
		
		
	}

	@Override
	public Void showdetails(Employee e) {
		
		System.out.println(e.getFname());
		System.out.println(e.getLname());
		System.out.println(e.getEmail());
		System.out.println(e.getPassword());
		return null;
	}

}
