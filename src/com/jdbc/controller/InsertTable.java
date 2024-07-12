package com.jdbc.controller;

import java.sql.SQLException;

import com.jdbc.dto.Employee;
import com.jdbc.service.EmployeeService;

public class InsertTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee employee=new Employee();
		employee.setId(2);
		employee.setName("rajamouli");
		employee.setAge(26);
		EmployeeService service=new EmployeeService();
		int x=service.insertEmployeeTable();
		System.out.println(x);
		
	}

}
