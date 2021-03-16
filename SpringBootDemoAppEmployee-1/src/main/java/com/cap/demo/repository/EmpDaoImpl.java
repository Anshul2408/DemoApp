package com.cap.demo.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cap.demo.entity.Employee;


@Repository
public class EmpDaoImpl implements EmpDao {

	@PersistenceContext
	EntityManager entityManager;

	public int addEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee.getEmployeeId();
	}

	public Employee updateEmployee(Employee employee) {
		return entityManager.merge(employee);
	}

	public void removeEmployee(int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		entityManager.remove(entityManager.merge(employee));

	}

	public Employee getEmployeeById(int employeeId) {
		Employee employee = entityManager.find(Employee.class, employeeId);
		return employee;
	}

	public List<Employee> getAllEmployee() {
		Query q = entityManager.createQuery("select e from Employee e");
		List<Employee> l = q.getResultList();
		return l;
	}

}
