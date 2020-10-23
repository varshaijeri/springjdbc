package com.varsha.springcore.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varsha.springcore.springjdbc.employee.dao.EmployeeDao;
import com.varsha.springcore.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/springcore/springjdbc/employee/test/config.xml");
		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");
		
		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstName("Asha");
//		employee.setLastName("KA");
		//int result = employeeDao.create(employee);
		//int result = employeeDao.update(employee);
		//int result = employeeDao.delete(employee);
		//employee = employeeDao.read(1);
		List<Employee> employees = employeeDao.read();
		System.out.println("Employee details: \n"+employees);
	}
}
