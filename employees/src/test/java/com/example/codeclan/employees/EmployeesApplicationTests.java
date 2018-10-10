package com.example.codeclan.employees;

import com.example.codeclan.employees.models.Employee;
import com.example.codeclan.employees.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee employee = new Employee("A. Person", 35, "123456789", "ap@somewhere.com" );
		employeeRepository.save(employee);
	}

}
