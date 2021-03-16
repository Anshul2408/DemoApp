package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.entity.Employee;
import com.cap.demo.service.EmpServiceImpl;

@RestController
@RequestMapping("/employee")//optional
public class EmpController {//http://localhost:2424/employee/getEmployee/123

	@Autowired
	EmpServiceImpl service;
	@GetMapping("/getEmployee/{tid}")//mand//json
	public Employee getEmployeeById(@PathVariable("tid") int employeeId)
		{
		System.out.println(service.getEmployeeById(employeeId));
			return service.getEmployeeById(employeeId);
		}
	//@RequestMapping(value="/addEmployee",method =RequestMethod.POST)//mand//json
	@PostMapping("/addEmployee")//http://localhost:2424/employee/addEmployee
	public int addEmployee(@RequestBody Employee employee)//get,post,put,delete
		{
		return service.addEmployee(employee);
			
		}
	@PutMapping("/updateEmployee")//http://localhost:2424/employee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee employee)//get,post,put,delete
		{
		return service.updateEmployee(employee);
			
		}
	@DeleteMapping("/deleteEmployee/{tid}")//http://localhost:1234/employee/updateEmployee
	public String deleteEmployee(@PathVariable("tid") int employeeId)//get,post,put,delete
		{
		 service.removeEmployee(employeeId);
			return "deleted successfully";
		}
	@GetMapping("/getAllEmployee")//http://localhost:1234/employee/updateEmployee
	public List<Employee> fetchAllEmployee()//get,post,put,delete
		{
		return service.getAllEmployee();
			
		}
}
