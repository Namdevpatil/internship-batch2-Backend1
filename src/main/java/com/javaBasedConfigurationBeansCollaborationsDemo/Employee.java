package com.javaBasedConfigurationBeansCollaborationsDemo;

public class Employee 
{
	
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	private Department department;
	
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

	

	public void setDepartment(Department department) {
		this.department = department;
	}




	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary,
			Department department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + ", department=" + department + "]";
	}


	
}
