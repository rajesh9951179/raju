package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.dto.Employee;

public class EmployeeDao {
	Employee employee=new Employee();
	
	public String CreateEmployeeTable()throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement s=c.createStatement();
	    s.execute("create table Employees (id int not null auto_increment,name varchar(45),age int,primary key(id) )");
		c.close();
		return "table created";
	}
	
	public int insertEmployeeTable()throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement s=c.prepareStatement("insert into Employees (id,name,age) values (?,?,?)");
	    s.setInt(1, employee.getId());
	    s.setString(2, employee.getName());
	    s.setInt(3,employee.getAge() );
		int b=s.executeUpdate();
		c.close();
		return b;
	}
	
	public int deleteEmployeeTable(int id)throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement s=c.prepareStatement("delete from   Employee where id=?");
	    s.setInt(1, employee.getId());
		int b=s.executeUpdate();
		c.close();
		return b;
	}
	
	public int updateEmployeeTable(Employee employee)throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement s=c.prepareStatement("update Employee set name=? where id=?");
	    s.setString(1, employee.getName());
	    s.setInt(2, employee.getId());

		int b=s.executeUpdate();
		c.close();
		return b;
	}
	
	public Employee getByIdEmployee(int id) throws ClassNotFoundException,SQLException
	{	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement s=c.prepareStatement("select id,name,age from   Employee where id=?");
	    s.setInt(1, id);
	    ResultSet b =s.executeQuery();
	    while(b.next())
	    {
	    	int idd=b.getInt(1);
	    	String name =b.getString(2);
	    int age=b.getInt(3);
	    employee.setId(idd);
	    employee.setName(name);
	    employee.setAge(age);
	    }
		return employee;
		
	}
	
	public List<Employee> getEmployeeTable()throws ClassNotFoundException,SQLException
	{	
		ArrayList<Employee> emps=new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement s=c.prepareStatement("select * from   Employee");
	    ResultSet b =s.executeQuery();
	    while(b.next())
	    {
	    int idd=b.getInt(1);
	    String name =b.getString(2);
	    int age=b.getInt(3);
	    employee.setId(idd);
	    employee.setName(name);
	    employee.setAge(age);
	    emps.add(employee);
	}
		return emps;
		
	}
}
