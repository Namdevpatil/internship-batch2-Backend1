package com.javaBasedConfigurationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigClass 
{
	
	
	@Bean(name = "employee")
	public Employee getEmployeeBean2()
	{
		return new Employee();
	}

}
