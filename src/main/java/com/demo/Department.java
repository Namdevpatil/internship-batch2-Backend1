package com.demo;

public class Department
{	
	
	private int departmentId;
	private String departmentName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	

}
