package com.coding.question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy {
	public static void main(String[] args) {
		String[][] arr = { 
				{}, 
				{ "Bobby", "100" }, 
				{ "Alex", "223" }, 
				{ "Alex", "-23" },
				{ "Bobby", "723" } 
				};
		List<List<Employee1>> emps =new ArrayList<List<Employee1>>();
		List<Employee1> emp1=new ArrayList<Employee1>();
		emp1.add(new Employee1( "Alia", -678 ));
		emp1.add(new Employee1( "Bobby", 100));
		emp1.add(new Employee1( "Alex", 223));
		emp1.add(new Employee1( "Alex", -23 ));
		emp1.add(new Employee1( "Bobby", 723 ));
		Comparator<Integer> compa = (a,b)->{
			return a-b;
			
		};
		 emp1.stream().collect(Collectors.groupingBy(Employee1::getName,Collectors.averagingInt(Employee1::getSalary))).
		forEach((k,v)->System.out.println(k+v));
		

	}
}


class Employee1{
	
	public Employee1(String name,Integer salary) {
		this.name=name;
		this.salary=salary;
	}
	String name;
	Integer salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
}