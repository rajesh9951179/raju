package com.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.dao.EmployeeDao;
import com.jdbc.dto.Employee;

public class EmployeeService {
	
	EmployeeDao dao= new EmployeeDao();
	
	public String CreateEmployeeTable() throws ClassNotFoundException, SQLException {
		return dao.CreateEmployeeTable();
	}
	
	public int insertEmployeeTable()throws ClassNotFoundException, SQLException {
		return dao.insertEmployeeTable();	
	}
	
	public int deleteEmployeeTable(int id)throws ClassNotFoundException, SQLException {
		return dao.deleteEmployeeTable(id);	
	}
	
	public int updateEmployeeTable(Employee employee) throws ClassNotFoundException, SQLException {
		return dao.updateEmployeeTable(employee);	
	}

	public Employee getByIdEmployeeTable(int id) throws ClassNotFoundException, SQLException {
		return dao.getByIdEmployee(id);	
	}
	
	public List<Employee> getEmployeeTable() throws ClassNotFoundException, SQLException {
		return dao.getEmployeeTable( );	
	}
}
