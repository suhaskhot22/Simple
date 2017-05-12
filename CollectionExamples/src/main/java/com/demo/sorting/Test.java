package com.demo.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*System.out.println("###### Sort Using Integer ######");	
		
	  ArrayList<Integer> al=new ArrayList<Integer>();
	  al.add(3);
	  al.add(2);
	  al.add(7);
	  al.add(5);
	  al.add(10);
		
	  System.out.println("Before Sort="+al);
		
	  
	  Collections.sort(al);
	  
	  System.out.println("After Sort="+al);
		
*/		
	  
	  System.out.println("###### Sort Using Object ######");
	  
	  Employee e1=new Employee(4, "suhas", 24);
	  Employee e2=new Employee(3, "sunil", 24);
	  Employee e3=new Employee(7, "jeevan", 24);
	  Employee e4=new Employee(6, "amar", 24);
	  Employee e5=new Employee(1, "pashu", 24);
	  
	  List<Employee> listofemp=new ArrayList<Employee>();
	  listofemp.add(e1);
	  listofemp.add(e2);
	  listofemp.add(e3);
	  listofemp.add(e4);
	  listofemp.add(e5);

	  
	  
	  System.out.println("Before Sort="+listofemp);
	  
	  
	  
	 /* Collections.sort(listofemp);
	  
	  System.out.println("After Sort="+listofemp);
	  
*/	  
	  
	  System.out.println("Sort By Employee Id");
	  Collections.sort(listofemp, Employee.EmpIdComparator );
	  System.out.println(listofemp);
	  
	  System.out.println("Sort By Employee Name");
	  Collections.sort(listofemp, Employee.EmpNameComparator);
	  System.out.println(listofemp);
	}

}
