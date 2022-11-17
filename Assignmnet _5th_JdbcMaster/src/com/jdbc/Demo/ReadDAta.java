package com.jdbc.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class ReadDAta {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
Statement st=conn.createStatement();
	
	String sql="select*from employee1";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getInt("deptid")+" "+rs.getString("designation"));
	}
	}
}