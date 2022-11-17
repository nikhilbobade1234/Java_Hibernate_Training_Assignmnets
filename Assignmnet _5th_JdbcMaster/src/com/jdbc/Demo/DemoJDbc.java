package com.jdbc.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoJDbc {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		PreparedStatement pst = conn.prepareStatement(
				"insert into employee1(eid , ename , salary , deptid , designation) values(?,?,?,?,?)");

		System.out.println("please enter id");
		pst.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("please enter employee name");
		pst.setString(2, sc.nextLine());
		System.out.println("please enter employee salary");
		pst.setInt(3, Integer.parseInt(sc.nextLine()));
		System.out.println("please enter employee deptid");
		pst.setInt(4, Integer.parseInt(sc.nextLine()));
		System.out.println("please enter employee designation");
		pst.setString(5, sc.nextLine());

		// execute the update
		pst.executeUpdate();
		System.out.println("Data inserted");

		// close the connection
		conn.close();

	}
}
