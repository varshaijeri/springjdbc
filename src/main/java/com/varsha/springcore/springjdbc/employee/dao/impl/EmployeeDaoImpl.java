package com.varsha.springcore.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.varsha.springcore.springjdbc.employee.dao.EmployeeDao;
import com.varsha.springcore.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.varsha.springcore.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}
	
	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?,lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(),employee.getLastName(), employee.getId());
		return result;
	}
	
	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql,employee.getId());
		return result;
	}
	
	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return emp;
	}
	
	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query(sql,rowmapper);
		return employees;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
