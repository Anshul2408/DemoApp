package com.cap.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="capemployees")
public class Employee {
	@Id
	@GeneratedValue
	@Column(length = 10)
	private int employeeId;
	@Column(length = 10)
	private String employeeName;
	@Column(length = 20)
	private String employeeDept;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	public Employee(String employeeName, String employeeDept) {
		super();
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + "]";
	}
public Employee() {
	// TODO Auto-generated constructor stub
}
	
	
}
