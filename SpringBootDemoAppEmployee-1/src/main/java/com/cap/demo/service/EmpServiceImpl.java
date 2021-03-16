package com.cap.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.entity.Employee;
import com.cap.demo.repository.EmpDao;

@Service("service") // TraineeServiceImpl service=new TraineeServiceImpl()
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao dao;

	public int addTrainee(Employee employee) {
		return dao.addEmployee(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}

	public void removeEmployee(int employeeId) {
		dao.removeEmployee(employeeId);
	}

	public Employee getEmployeeById(int employeeId) {
		return dao.getEmployeeById(employeeId);
	}

	public List<Employee> getAllEmployee() {

		return dao.getAllEmployee();
	}

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

}
