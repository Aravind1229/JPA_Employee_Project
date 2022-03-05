package com.example.spring.jpa.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring.jpa.employee.entity.Employee;
import com.example.spring.jpa.employee.repository.EmployeeRepository;

@Controller
public class EmployeeController {
@Autowired
EmployeeRepository repository;
@RequestMapping(value="/home")
public String home() {
	return "home.jsp";
}
@RequestMapping(value="/create")
public String create() {
	return "createEmployee.jsp";
}
@RequestMapping(value="/delete")
public String delete() {
	return "deleteEmployee.jsp";
}
@RequestMapping(value="/update")
public String update() {
	return "updateEmployee.jsp";
}
@RequestMapping(value="/display")
public String display() {
	return "findById.jsp";
}
@RequestMapping(value="/createemployee",method=RequestMethod.POST)
public String createEmployee(@RequestParam String name,@RequestParam Integer age,@RequestParam Integer salary,@RequestParam String designation,ModelMap model) {
	repository.insertEmployee(name, age, salary, designation);
	model.put("message1","User is inserted");
	return "message.jsp";
}
@RequestMapping(value="/findemployee")
public String findEmployee(@RequestParam Integer id,ModelMap model) {
	Employee employee = repository.findById(id);
	if(employee==null) {
		model.put("message","User not found");
		return "message.jsp";
	}
	else {
	model.put("id",employee.getId());
	model.put("name", employee.getName());
	model.put("age", employee.getSalary());
	model.put("salary", employee.getAge());
	model.put("designation",employee.getDesignation());
	return "details.jsp";
	}
	
}
@RequestMapping(value="/deleteemployee")
public String deleteEmployee(@RequestParam Integer id,ModelMap model) {
	repository.deleteById(id);
	model.put("message2","User is deleted");
	return "message.jsp";
}
@RequestMapping(value="/updateemployee")
public String updateEmployee(@RequestParam Integer id,@RequestParam Integer salary,ModelMap model) {
	repository.updateEmployee(id,salary);
	model.put("message3","User salary is updated");
	return "message.jsp";
}
}

