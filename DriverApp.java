package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeCredentialsimpl;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The First Name: ");
		String f=sc.next();
		System.out.println("Please Enter The Last Name: ");
		String l=sc.next();
		
		Employee emp1= new Employee(f,l);
		EmployeeCredentialsimpl cred= new EmployeeCredentialsimpl();
		
		System.out.println("Choose a department:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        System.out.print("Enter the department number: ");
        int choice=sc.nextInt();
        String genemail=" ";
        String genpassword=" ";
        
        switch (choice) {
        case 1: genemail=cred.generateemail(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "technical");
        break;
        case 2: genemail=cred.generateemail(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "admin");
        break;
        case 3: genemail=cred.generateemail(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "Human Resource");
        break;
        case 4: genemail=cred.generateemail(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(), "legal");
        break;
        
        default:
        	System.out.println("Please Enter Valid Input");
        	}
        
genpassword=cred.generatepassword();
emp1.setEmail(genemail);
emp1.setPassword(genpassword);

cred.showdetails(emp1);
}
}