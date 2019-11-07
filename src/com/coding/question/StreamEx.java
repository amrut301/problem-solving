package com.coding.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEx {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "amrut", "P", 10);
		Employee emp2 = new Employee(2, "amrut", "C", 20);
		Employee emp3 = new Employee(3, "amrut", "C", 30);
		Employee emp4 = new Employee(4, "amrut", "P", 40);
		Employee emp5 = new Employee(5, "shel", "O", 20);
		Employee emp6 = new Employee(6, "lel", "O", 20);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		List<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(emp4);
		empList1.add(emp5);
		empList1.add(emp6);

		List<List<Employee>> listofList = new ArrayList<List<Employee>>();
		listofList.add(empList1);
		listofList.add(empList);
//		Map<Employee, Long> lksjf = listofList.stream().flatMap(List::stream)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Double> sda = listofList.stream().flatMap(List::stream)
				.collect(Collectors.groupingBy(Employee::getName, Collectors.averagingInt(Employee::getAge)));
		sda.forEach((k, v) -> {
//			System.out.println(k + "  " + v);
		});

		List<Student> stList1 = new ArrayList<Student>();
		List<Student> stList = new ArrayList<Student>();
		Student s1 = new Student(12, "Amrut");
		Student s2 = new Student(10, "Amrut");
		Student s3 = new Student(-10, "Amit");
		Student s4 = new Student(0, "tej");
		Student s5 = new Student(10, "shel");
		Student s6 = new Student(45, "tej");
		Student s7 = new Student(65, "chat");
		Student s8 = new Student(1, "chat");
		stList1.add(s1);
		stList1.add(s2);
		stList1.add(s3);
		stList1.add(s4);
		stList.add(s5);
		stList.add(s6);
		stList.add(s7);
		stList.add(s8);
		ArrayList<List<Student>> studentList = new ArrayList<List<Student>>();
		studentList.add(stList);
		studentList.add(stList1);
		Map<String, Double> map = studentList.stream().flatMap(List::stream)
				.collect(Collectors.groupingBy(Student::getName, Collectors.averagingInt(Student::getMark)));
		Map<Boolean, List<Student>> part = studentList.stream().flatMap(List::stream).collect(Collectors.partitioningBy(item->item.getMark()<10));
		part.forEach((k, v) -> {
			System.out.println(k + "  " + v);
		});
		
		
	}
}

class Student {
	int mark;
	String name;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int mark, String name) {
		super();
		this.mark = mark;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", name=" + name + "]";
	}

}

class Employee {
	int id;
	String name;
	String type;
	int age;

	public Employee(int id, String name, String type, int age) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", type=" + type + ", age=" + age + "]";
	}

}
