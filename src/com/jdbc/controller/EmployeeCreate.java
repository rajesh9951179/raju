package com.jdbc.controller;

import java.sql.SQLException;

import com.jdbc.service.EmployeeService;

public class EmployeeCreate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		EmployeeService service=new EmployeeService();

		String s=service.CreateEmployeeTable();
	if(s!=null)
	{
		System.out.println(s);
	}

}
}