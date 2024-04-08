package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args)
	{
		
		Employee employee1 = new Employee(1018, "Raj", "Java Developer", 90000.90);
		System.out.println(employee1.toString());
		
		System.out.println("=======================================employee bean===========================================");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		Employee employee2 = (Employee) context.getBean("employee");
		
		System.out.println(employee2.toString());
		
		System.out.println("=======================================department bean===========================================");
		
		Department department = (Department) context.getBean("department");
		
		System.out.println(department.toString());

	}

}
