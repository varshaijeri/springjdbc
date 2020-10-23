package com.varsha.springcore.springjdbc.passenger.dto;

public class Passenger {
	int id;
	String firstname;
	String lastname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
