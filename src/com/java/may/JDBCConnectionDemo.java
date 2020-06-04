package com.java.may;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/EMPLOYEE";
	static final String JDBC_USER = "root";
	static final String JDBC_PASSWORD = "Swift1@3$";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		System.out.println("Register JDBC Driver");
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Creating Database Connection , Opening a connection");
			conn = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);// url, user, password
			
			System.out.println("Creating and executing Query");
			
			stmt = conn.createStatement();
			String sql = "select * from emp_tbl where emp_id > 2";
			ResultSet set = stmt.executeQuery(sql);
			
			System.out.println("Extracting data from ResultSet");
			while(set.next()){
				int id = set.getInt("emp_id");
				String fName = set.getString("first_name");
				String LName = set.getString("last_name");
				int age = set.getInt("emp_age");
				
				System.out.println("Employee ID: " + id + " FirstName: " + fName + " LastName: " +LName + " Age: "+ age);
			}
			set.close();
			stmt.close();
			conn.close();
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("DataBase Class Not Found" + e);
		} catch (SQLException e) {
			System.out.println("Sql Exception check your connection");
			e.printStackTrace();
		} finally{
			System.out.println("This will makes sure the connections are closed");
			if(conn!= null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Database Connection Closed Successfully");
				}
			}
			System.out.println("Good Bye");
		}
	
	}

}
