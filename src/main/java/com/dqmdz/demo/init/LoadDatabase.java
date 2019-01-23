package com.dqmdz.demo.init;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dqmdz.demo.dao.IEmployeeRepository;
import com.dqmdz.demo.model.Employee;

@Configuration
public class LoadDatabase {
	@Bean
	public CommandLineRunner initDatabase(IEmployeeRepository repository) {
		return args -> {
			repository.save(new Employee(1, "Pepe", "Manager", 1L, new Date(),
					new Timestamp(Calendar.getInstance().getTime().getTime()), ""));
			repository.save(new Employee(2, "Juan", "Employee", 2L, new Date(),
					new Timestamp(Calendar.getInstance().getTime().getTime()), ""));
		};
	}
}
