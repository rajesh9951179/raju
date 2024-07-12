package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateJdbc {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement s=c.createStatement();
		int b=s.executeUpdate("update user set name='ramya' where id=1");
		c.close();
		if(b>0)
		{
			System.out.println("update sucessfully");
		}
		else
		{
			System.out.println("update fail");
		}
	}

}
