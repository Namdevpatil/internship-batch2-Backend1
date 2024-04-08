package com.javaBasedConfigurationBeansCollaborationsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args)
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigClass.class);

		Department department = (Department) context.getBean("department");
		department.setDepartmentId(3344);
		department.setDepartmentName("Deployment Department");
		
		Employee employee = (Employee) context.getBean("employee");
		employee.setEmployeeId(1100);
		employee.setEmployeeName("Satish Patil");
		employee.setEmployeeRole("PHP Developer");
		employee.setEmployeeSalary(87733.23);
		employee.setDepartment(department);

		System.out.println(employee.toString());

	}

}
