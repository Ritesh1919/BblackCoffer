package com.blackcoffer;

import java.sql.*;

public class ConnectionProvider {

	static Connection connection;

	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "root";
			String password="admin";
			String url="jdbc:mysql://localhost:3306/blackcoffer";
			connection = DriverManager.getConnection(url,user,password);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("There is something wrong");
		}
		return connection;
	}
}
