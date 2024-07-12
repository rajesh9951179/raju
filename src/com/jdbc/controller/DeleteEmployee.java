package com.jdbc.controller;

import java.sql.SQLException;

import com.jdbc.service.EmployeeService;

public class DeleteEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeService employeeService=new EmployeeService();
		int i=employeeService.deleteEmployeeTable(0);
		System.out.println(i);
	}

}
