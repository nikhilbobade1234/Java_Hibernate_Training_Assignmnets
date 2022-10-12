package Assignment_2nd_Days;

import java.util.Scanner;

public class Employee {
	private int eid;
	private String ename;
	private double BasicSalary;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double BasicSalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.BasicSalary = BasicSalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getBasicSalary() {
		return BasicSalary;
	}

	public void setSalary(double BasicSalary) {
		this.BasicSalary = BasicSalary;
	}

	public double DA() {
		return (52 / 100) * BasicSalary;

	}

	public double Gs() {
		int HRA = 2000;
		return BasicSalary + DA() + HRA;

	}

	public double incometax() {
		return (30 / 100) * Gs();

	}

	public double NetSalary() {
		return Gs() - incometax();

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int eid=sc.nextInt();
		
		System.out.println("Enter name");
		String ename =sc.next();
		
		System.out.println("Enter Basic Salary");
		double BasicSalary = sc.nextDouble();
		Employee e1 = new Employee(eid,ename,BasicSalary);
		System.out.println(ename+" have Net (Gross Salary) = "+e1.NetSalary());
	}
}
