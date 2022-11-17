package JdbcAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Que1 {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
Statement st=conn.createStatement();
	
	String sql="select * from employee join department on employee.deptid=department.deptid";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		
	System.out.println(	"Employeeid "+rs.getInt("eid"));
	System.out.println("Employee Name "+rs.getString("ename"));
	System.out.println("Employee department id "+rs.getInt("deptid"));
	System.out.println("Employee Designation "+rs.getString("designation"));
	System.out.println("Department Id "+rs.getInt("deptid"));
System.out.println("Department Name "+rs.getString("dname"));
	System.out.println("===================");
	}
}
}
