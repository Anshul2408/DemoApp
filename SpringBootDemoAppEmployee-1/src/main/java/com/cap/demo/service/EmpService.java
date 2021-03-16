package com.cap.demo.service;

import java.util.List;

import com.cap.demo.entity.Employee;

public interface EmpService {

		int addEmployee(Employee Employee);

		Employee updateEmployee(Employee employee);

		void removeEmployee(int employeeId);

		Employee getEmployeeById(int employeeId);

		List<Employee> getAllEmployee();
	
}
