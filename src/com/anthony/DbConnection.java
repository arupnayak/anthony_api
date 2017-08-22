package com.anthony;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@apex.c0qdu1ivnlig.us-east-1.rds.amazonaws.com:1521:ORCL", "arup", "Welcome123");
			return con;
		} catch (SQLException ex) {
			StackTraceElement[] ste = ex.getStackTrace();
			System.out.println("SQLException: " + ex.getMessage());
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());

			}
		} catch (Exception ex) {
			System.out.println("Exception:" + ex.getMessage());
			StackTraceElement[] ste = ex.getStackTrace();
			System.out.println("Exception: " + ex.getMessage());
			for (int i = 0; i < ste.length; i++) {
				System.out.println(ste[i].toString());

			}
		}
		return null;
	}
}
