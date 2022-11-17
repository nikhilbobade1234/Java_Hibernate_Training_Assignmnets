package com.jdbc.Demo1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public static void insertEmployee(Employee1 e) throws Exception {

		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn
				.prepareStatement("insert into Employee1(eid,ename, salary,deptid,designation) values(?,?,?,?,?)");
		pst.setInt(1, e.getEid());
		pst.setString(2, e.getEname());
		pst.setInt(3, e.getSalary());
		pst.setInt(4, e.getDeptid());
		pst.setString(5, e.getDesignation());

		pst.executeUpdate();
		conn.close();

	}

	public static void updateEmployee(Employee1 e) throws Exception {

		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn
				.prepareStatement("update employee1 set ename=?, salary=?, deptid=?, designation=? where eid=?");
		pst.executeUpdate();
		conn.close();

	}

	public static Employee1 getEmployeeById(int id) throws Exception {
		List<Employee1> employees = new ArrayList<Employee1>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn.prepareStatement("select * from employee1 where eid=?");
		pst.setInt(1, id);
		// Statement st=conn.createStatement();
		// st.executeQuery("select * from employee");

		ResultSet rs = pst.executeQuery();
		// st.set
		if (rs.next())
			return new Employee1(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
		else {
			System.out.println("employee with the Id not Found");
			return null;
		}
	}

	public static List<Employee1> getAllEmployee() throws SQLException {
		List<Employee1> employees = new ArrayList();
		Connection conn = ConnectionMaster.getConnection();

		Statement pst = conn.createStatement();
		String sql = "select*from employee1";
		ResultSet rs = pst.executeQuery(sql);
		while (rs.next()) {
			employees.add(new Employee1(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
		}
		return employees;
	}

	public static Employee1 getEmployeeByName(String name) throws Exception {
		List<Employee1> employees = new ArrayList<Employee1>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn.prepareStatement("select * from employee1 where ename=?");
		pst.setString(1, name);

		ResultSet rs = pst.executeQuery();

		if (rs.next())
			return new Employee1(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
		else {
			System.out.println("employee with the Name not Found");
			return null;
		}
	}

	public static List<Employee> getEmployeeByDanme(String danme) throws SQLException {
		List<Employee> employees = new ArrayList<Employee>();
		Connection conn = ConnectionMaster.getConnection();
		PreparedStatement pst = conn.prepareStatement(
				"select * from employee inner join department where employee.deptid=department.deptid and dname=?");
		pst.setString(1, danme);
		ResultSet rs = pst.executeQuery();
		java.sql.ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++)
			System.out.println(rsmd.getColumnName(i) + " has the type " + rsmd.getColumnTypeName(i));

		if (rs.next()) {

			employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
					rs.getString(6)));

			return employees;
		} else {
			System.out.println("employee with the Name not Found");
		}
		return null;
	}

	public static void DeleteEmployee(int id) throws SQLException {

		Connection conn = ConnectionMaster.getConnection();

		CallableStatement cst = conn.prepareCall("{call delete_employee(?)}");

		cst.setInt(1, id);
		cst.execute();
		conn.close();

	}
}
