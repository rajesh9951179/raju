package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetJdbc {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			PreparedStatement s=c.prepareStatement("select * from user");
			ResultSet r=s.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt(1));
				System.out.println(r.getString(2));
				System.out.println(r.getLong(3));
				System.out.println("-----------------------");
			}
			
			c.close();
		}

	

}
