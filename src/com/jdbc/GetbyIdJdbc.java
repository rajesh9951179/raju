package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetbyIdJdbc {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement s=c.prepareStatement("select name ,age from user where id=1");
		ResultSet b=s.executeQuery();
		while(b.next())
		{
		System.out.println(b.getString(1));
		System.out.println(b.getInt(2));
		}
		c.close();

	}

}
