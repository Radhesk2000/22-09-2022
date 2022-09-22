package com.inheritence.exercises;

import com.inheritence.exercises.HourlyEmployee;
import com.inheritence.exercises.SalaryEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		
		SalaryEmployee salary_employee = new SalaryEmployee(1000,"Rahul","C# Developer"); 
		
		HourlyEmployee hourly_employee = new HourlyEmployee(5000,"Raj","Java Developer");
		
		System.out.println(salary_employee);
		System.out.println("Weekly Salary : "+salary_employee.calculatePay(13));
		
		System.out.println(hourly_employee);
		System.out.println("Hourly Salary : "+hourly_employee.calculatePay(1.5));

	}

}
