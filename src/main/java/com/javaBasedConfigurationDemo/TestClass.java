package com.javaBasedConfigurationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args)
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigClass.class);

		Employee employee = (Employee) context.getBean("employee");
		employee.setEmployeeId(1100);
		employee.setEmployeeName("Satish Patil");
		employee.setEmployeeRole("PHP Developer");
		employee.setEmployeeSalary(87733.23);

		System.out.println(employee.toString());

	}

}
