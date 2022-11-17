package com.jdbc.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		PreparedStatement pst = con.prepareStatement("delete from  employee1  where eid=? ");
		System.out.println("please enter id");
		pst.setString(1, sc.nextLine());
		pst.executeUpdate();
		System.out.println("Succesfully Delete");
		// close the connection
		con.close();
	}
}