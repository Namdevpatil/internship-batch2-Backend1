package com.demoBeanCollaborations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass 
{

	public static void main(String[] args)
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
		
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee.toString());
		

	}

}
