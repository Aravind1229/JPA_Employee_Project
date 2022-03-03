package com.jpa.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue
private int id;
private String name;
private int age;
private int Salary;
private String designation;
public Employee() {
	
}
public Employee(String name, int age, int salary, String designation) {
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Salary=" + Salary + ", designation="
			+ designation + "]";
}

}
