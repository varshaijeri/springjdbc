package com.varsha.springcore.springjdbc.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varsha.springcore.springjdbc.employee.dao.EmployeeDao;
import com.varsha.springcore.springjdbc.employee.dto.Employee;
import com.varsha.springcore.springjdbc.passenger.dao.PassengerDao;
import com.varsha.springcore.springjdbc.passenger.dto.Passenger;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/varsha/springcore/springjdbc/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) ctx.getBean("passengerDao");

		Passenger passenger = new Passenger();

//		passenger.setId(1);
//		passenger.setFirstname("Varsha");
//		passenger.setLastname("Ijeri");
		// int result = passengerDao.create(passenger);
		// System.out.println("Inserted passenger record number: "+result);

//		passenger.setId(2);
//		passenger.setFirstname("Asha");
//		passenger.setLastname("KA");
//		int result = passengerDao.create(passenger);
//		System.out.println("Inserted passenger record number: "+result);

//		passenger.setId(2);
//		passenger.setFirstname("Asha");
//		passenger.setLastname("KAJ");
//		int result = passengerDao.update(passenger);

//		passenger.setId(2);
//		int result = passengerDao.delete(passenger);

//		passenger = passengerDao.read(1);

		List<Passenger> passengers = passengerDao.readAll();
		System.out.println("Employee details: \n" + passengers);
	}
}