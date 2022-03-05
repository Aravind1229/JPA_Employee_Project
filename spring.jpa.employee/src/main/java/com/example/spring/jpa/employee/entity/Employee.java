package com.example.spring.jpa.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue
private Integer id;
private String name;
private Integer age;
private Integer Salary;
private String designation;
public Employee() {
	
}
public Employee(String name, Integer age, Integer salary, String designation) {
	this.name = name;
	this.age = age;
	Salary = salary;
	this.designation = designation;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Integer getSalary() {
	return Salary;
}
public void setSalary(Integer salary) {
	Salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Integer getId() {
	return id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Salary=" + Salary + ", designation="
			+ designation + "]";
}

}