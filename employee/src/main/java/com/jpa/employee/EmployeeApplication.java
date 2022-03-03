package com.jpa.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jpa")
public class EmployeeApplication implements CommandLineRunner{
	private Logger logger=LoggerFactory.getLogger(this.getClass());
@Autowired
EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		employeeRepository.insertEmployee("Aravind", 22, 17000,"Developer");
		Employee employee = employeeRepository.findById(1);
		logger.info("Employee -> {}",employee);
		Employee updatedEmployee = employeeRepository.updateEmployee(1,"aravind", 23, 17500,"Trainee");
		logger.info("Updated Employee -> {}",updatedEmployee);
		//employeeRepository.deleteById(1);
	}

}
