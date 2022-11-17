package com.jdbc.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		PreparedStatement pst = conn.prepareStatement ("update employee1 set ename=? ,salary=?, deptid=?, designation=? where eid=?");
		  System.out.println("please enter id");
	        pst.setString(5,sc.nextLine());
	        System.out.println("please enter employee name");
	        pst.setString(1, sc.nextLine());
	        System.out.println("please enter employee salary");
	        pst.setInt(2, Integer.parseInt(sc.nextLine()));
	        System.out.println("please enter employee deptid");
	        pst.setInt(3, Integer.parseInt(sc.nextLine()));
	        System.out.println("please enter employee designation");
	        pst.setString(4, sc.nextLine());
	        
	        //execute the update
	        pst.executeUpdate();
	        System.out.println("Successfully upadte");
	        //close the connection
	        conn.close();
}
}
