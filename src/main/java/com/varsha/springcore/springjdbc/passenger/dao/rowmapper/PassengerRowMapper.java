package com.varsha.springcore.springjdbc.passenger.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varsha.springcore.springjdbc.passenger.dto.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setId(rs.getInt(1));
		passenger.setFirstname(rs.getString(2));
		passenger.setLastname(rs.getString(3));
		return passenger;
	}

}
