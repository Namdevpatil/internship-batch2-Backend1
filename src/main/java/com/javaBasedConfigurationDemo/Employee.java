package com.javaBasedConfigurationDemo;

public class Employee 
{
	
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	
	public Employee() 
	{
		
	}

	
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}



	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + "]";
	}
		
	
}
