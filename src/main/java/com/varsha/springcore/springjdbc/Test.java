package com.varsha.springcore.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/springcore/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, 1, "varsha", "Ijeri");
		System.out.println("number of records: " + result);
	}

}
