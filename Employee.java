import java.io.*;
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	// Employee 类的构造器
	public Employee(String name){
		this.name = name;
	}
	
	// Set value of age
	public void empAge( int empAge){
		age = empAge;
	}
	// Set value of designation
	public void empDesignation( String empDesig ){
		designation = empDesig;
	}
	// Set value of salary
	public void empSalary( double empSalary){
		salary = empSalary;
	}
	// Print infomation
	public void printEmployee(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		
	}
}
