package JdbcAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Que7 {
	static String URL = "jdbc:mysql://localhost:3306/jdbctemplate";
	static String USERNAME = "root";
	static String PASSWORD = "root";

	public static void main(String[] args) throws Exception {

		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
Statement st=conn.createStatement();
	
	String sql="select Gender, avg(salary) from employee group by Gender";
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		
		System.out.println("Avarage Salary of "+rs.getString("Gender")+" = "+rs.getInt("avg(salary)"));
	}
}
}
