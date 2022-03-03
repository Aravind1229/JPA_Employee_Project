package com.jpa.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepository {
@Autowired
EntityManager em;
public void insertEmployee(String name,int age,int salary,String designation) {
	Employee employee=new Employee(name,age,salary,designation);
	em.persist(employee);
}
public Employee findById(int id) {
	return em.find(Employee.class,id);
}
public void deleteById(int id) {
	Employee employee=findById(id);
	em.remove(employee);
}
public Employee updateEmployee(int id,String name,int age,int salary,String designation) {
	Employee employee = findById(id);
	employee.setName(name);
	employee.setAge(age);
	employee.setSalary(salary);
	employee.setDesignation(designation);
	em.merge(employee);
	return employee;
}
}
