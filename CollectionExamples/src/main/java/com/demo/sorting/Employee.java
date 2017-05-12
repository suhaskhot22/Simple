package com.demo.sorting;

import java.util.Comparator;

public class Employee /*implements Comparable<Employee>*/ {


	private int empId;
	private String empName;
	private int empAge;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
/*	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.empId-o.empId;
		//reverse
		//return -(this.empId-o.empId);
	}
*/	
	
	public static Comparator<Employee> EmpIdComparator=new Comparator<Employee>()
	{

		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.empId-o2.empId;
		}
		
		
	};
	
	public static Comparator<Employee> EmpNameComparator = new Comparator<Employee>()
	{

		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.empName.compareTo(o2.empName);
		}
		
	};
	
	
}
