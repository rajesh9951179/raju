package com.jdbc.controller;

import java.sql.SQLException;

import com.jdbc.dto.Employee;
import com.jdbc.service.EmployeeService;	

public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeService employeeService=new EmployeeService();
		Employee employee=new Employee();
		employee.setName("ama");
		employee.setId(2);
		int i=employeeService.updateEmployeeTable(employee);
		if(i>0) {
			System.out.println("update sucessfully");
		}
		else
		{
			System.out.println("update fail");
		}
	}
}
