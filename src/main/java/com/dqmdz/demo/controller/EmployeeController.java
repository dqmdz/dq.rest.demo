package com.dqmdz.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dqmdz.demo.dao.IEmployeeRepository;
import com.dqmdz.demo.exception.EmployeeNotFoundException;
import com.dqmdz.demo.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private IEmployeeRepository repository;
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return repository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee findById(@PathVariable Integer id) {
		return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
	}
	
	@PostMapping("/employees")
	public Employee add(@RequestBody Employee objeto) {
		return repository.save(objeto);
	}
}
