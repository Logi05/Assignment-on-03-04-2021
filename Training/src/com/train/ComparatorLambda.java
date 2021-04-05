package com.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLambda {
public static void main(String args[])
{
	ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(6,"Priya",24));
	list.add(new Employee(4,"Gayu",27));
	list.add(new Employee(9,"Ajay",25));
	list.add(new Employee(5,"Ramya",26));
	
	Comparator<Employee> C=(E1,E2) -> {
		return (E1.empAge==E2.empAge)?0:(E1.empAge>E2.empAge)?1:-1;		 
	};
	System.out.println("Sorted by an Employee Age:");
	Collections.sort(list,C);
	for(Employee e:list)
	{
		System.out.println(e.empId+" "+e.empName+" "+e.empAge);
	}
	
	Comparator<Employee> C1=(E1,E2) -> {
		return (E1.empId==E2.empId)?0:(E1.empId>E2.empId)?1:-1;		 
	};
	System.out.println("Sorted by an Employee ID:");
	Collections.sort(list,C1);
	for(Employee e:list)
	{
		System.out.println(e.empId+" "+e.empName+" "+e.empAge);
	}
	

	Comparator<Employee> C3=(E1,E2) -> {
		return E1.empName.compareTo(E2.empName);
	};
	System.out.println("Sorted by an Employee Name:");
	Collections.sort(list,C3);
	for(Employee e:list)
	{
		System.out.println(e.empId+" "+e.empName+" "+e.empAge);
	}
}
}

class Employee
{
	int empId;
	String empName;
	int empAge;
	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	
}

