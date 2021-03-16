package com.cap.demo.repository;

import java.util.List;

import com.cap.demo.entity.Employee;
public interface EmpDao {
	int addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void removeEmployee(int employeeId);

	Employee getEmployeeById(int employeeId);

	List<Employee> getAllEmployee();
}
