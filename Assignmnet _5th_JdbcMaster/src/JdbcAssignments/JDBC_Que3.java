package JdbcAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Que3 {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
Statement st=conn.createStatement();
	
	String sql="select employee.ename, employee.salary from employee order by salary desc limit 1,1";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		
		System.out.println("Second Highest Salary of Employee name is = "+rs.getString("ename")+", Salary is = "+rs.getInt("salary"));
	}
}
}
