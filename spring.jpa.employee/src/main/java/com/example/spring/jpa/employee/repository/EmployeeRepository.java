package com.example.spring.jpa.employee.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.spring.jpa.employee.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Service
@Repository
@Transactional
public class EmployeeRepository {
@Autowired
EntityManager em;
public Employee insertEmployee(String name,Integer age,Integer salary,String designation) {
	Employee employee=new Employee(name,age,salary,designation);
	em.persist(employee);
	return employee;
}
public Employee findById(Integer id) {
	Employee employee = em.find(Employee.class,id);
	return employee;
}
public void deleteById(Integer id) {
	Employee employee=findById(id);
	em.remove(employee);
}
public void updateEmployee(Integer id,Integer salary) {
	Employee employee =findById(id);
	employee.setSalary(salary);
	em.merge(employee);
}
}
