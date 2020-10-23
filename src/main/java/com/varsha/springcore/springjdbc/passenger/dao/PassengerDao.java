package com.varsha.springcore.springjdbc.passenger.dao;

import java.util.List;

import com.varsha.springcore.springjdbc.passenger.dto.Passenger;

public interface PassengerDao {
	int create(Passenger passenger);

	int update(Passenger passenger);

	int delete(Passenger passenger);

	Passenger read(int id);

	List<Passenger> readAll();
}
