package com.javaBasedConfigurationBeansCollaborationsDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigClass 
{
	
	
	@Bean(name = "employee")
	public Employee getEmployeeBean()
	{
		return new Employee();
	}
	
	@Bean(name = "department")
	public Department getDepartmentBean()
	{
		return new Department();
	}

}
