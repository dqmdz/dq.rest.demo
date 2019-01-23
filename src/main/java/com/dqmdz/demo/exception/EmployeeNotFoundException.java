package com.dqmdz.demo.exception;

public class EmployeeNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4571609524921826304L;

	public EmployeeNotFoundException(Integer id) {
		super ("No se puede encontrar employee " + id);
	}
}
