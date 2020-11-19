package org.emp;

public class Employee {
	public void empId(int id, double phoneno, int age) {
		System.out.println("int,double method");
		System.out.println("employee id is :" +id);
		System.out.println("employee phoneno is :" + phoneno);
		System.out.println("employee age is :" +age);
	}
	public void empId(double salary, String name){
		System.out.println("double, String method");
		System.out.println("employee salary is :" +salary);
		System.out.println("employee name is :" +name);
	}
	public void empId(String city,double pincode) {
		System.out.println("double,String method");
		System.out.println("employee pincode is :" +pincode);
		System.out.println("employee city is :" +city);
	}
	
public static void main(String[] args)
{
	Employee e=new Employee();
	e.empId(25357,709496186,22);
	e.empId(452.000,"menaka");
	e.empId(621207, "Trichy");
}
}
