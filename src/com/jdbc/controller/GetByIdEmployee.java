package com.jdbc.controller;

import java.sql.SQLException;

import com.jdbc.dto.Employee;
import com.jdbc.service.EmployeeService;

public class GetByIdEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeService employeeService=new EmployeeService();
		Employee employee=employeeService.getByIdEmployeeTable(2);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
	}

}
