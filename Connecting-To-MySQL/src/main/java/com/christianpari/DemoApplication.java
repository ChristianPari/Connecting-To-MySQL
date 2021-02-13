package com.christianpari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "INSERT INTO users (full_name, email, password) VALUES (?, ?, ?)";
//		int result = jdbcTemplate.update(sql, "Christian Pari", "christianpari@gmail.com", "1031");
//
//		if (result > 0) {
//			System.out.println("\n##### A new row has been inserted #####\n");
//		}
//	}
}
