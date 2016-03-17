import java.io.*;
public class EmployeeTest {
	
	public static void main(String []args){
		/* 使用构造器创建两个对象 */
		 Employee empOne = new Employee("James Smith");
		 Employee empTwo = new Employee("Vincent Zhuang");
		 
		 // Call their methods
		 empOne.empAge(25);
		 empOne.empDesignation("Software Engineer");
		 empOne.empSalary(4800);
		 empOne.printEmployee();
		 
		 empTwo.empAge(33);
		 empTwo.empDesignation("Senior Test Engineer");
		 empTwo.empSalary(8500);
		 empTwo.printEmployee();
		 
	}
}
