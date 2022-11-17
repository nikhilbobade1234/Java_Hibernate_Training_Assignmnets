package com.jdbc.Demo1;

public class EmployeeMaster {
	public static void main(String[] args) throws Exception {
		
	
	Employee1 e1=new Employee1(12,"Nahush",20,78999,"Developer");
	
	/*EmployeeDao.insertEmployee(e1);*/
	/*
	 * System.out.println(EmployeeDao.getEmployeeById(1));
	 * System.out.println(EmployeeDao.getAllEmployee());
	 */
	/* System.out.println(EmployeeDao.getEmployeeByName("Nikhil")); */
/*
 * EmployeeDao.getEmployeeByDanme("Development").stream().forEach(System.out::
 * println);;
 */
/*
 * EmployeeDao.DeleteEmployee(1); System.out.println("Successfully deleted");
 */
	System.out.println(EmployeeDao.getEmployeeByDanme("H.R"));
	}
}