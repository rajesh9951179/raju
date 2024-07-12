package com.jdbc.controller;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.dto.Employee;
import com.jdbc.service.EmployeeService;

public class GetEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeService employeeService=new EmployeeService();
		List<Employee>  em=employeeService.getEmployeeTable();
		for(Employee obj:em)
		{
			System.out.println(obj.getId());
			System.out.println(obj.getName());
			System.out.println(obj.getAge());
		}
		
	}
}
