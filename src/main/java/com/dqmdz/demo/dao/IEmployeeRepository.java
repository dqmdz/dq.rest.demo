/**
 * 
 */
package com.dqmdz.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dqmdz.demo.model.Employee;

/**
 * @author daniel
 *
 */
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
