package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeCredentials {
String generateemail(String Fname, String Lname, String Department);
String generatepassword();

Void showdetails(Employee e);
}
