package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbc {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement s=c.createStatement();
		boolean b=s.execute("insert into user (id,name,age) values(1,'madhu',25)");
		c.close();
		System.out.println(b);
	
	}

}
