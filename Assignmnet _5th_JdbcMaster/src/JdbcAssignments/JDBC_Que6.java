package JdbcAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Que6 {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
Statement st=conn.createStatement();
	
	String sql="select department.dname, count(*) from employee join department on employee.deptid=department.deptid group by dname";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		
		System.out.println("Department name is  "+rs.getString("dname")+" = "+rs.getInt("count(*)"));
	}
}
}
