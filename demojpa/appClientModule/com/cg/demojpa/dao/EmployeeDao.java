package com.cg.demojpa.dao;

import java.util.List;

import com.cg.demojpa.dto.Employee;

public interface EmployeeDao {

	public Employee save(Employee emp);
	public List<Employee> findAll();
	public void remove(Integer empId);
	public Employee searchEmployee(Integer empId);
	public List<Employee> findBetweenSalary(double min, double max);
}
