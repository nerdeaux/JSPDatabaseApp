package com.vusi.dao;

import java.util.List;

import com.vusi.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	boolean save(Employee employee);
	
	boolean delete(int id);
	
	boolean update(Employee employee);
}
