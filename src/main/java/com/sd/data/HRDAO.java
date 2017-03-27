package com.sd.data;

import java.util.List;

public interface HRDAO {
	 	Employee getEmployeeById(int id);
	 	Employee addEmployee(Employee newEmp);
		Employee updateEmployee(Employee emp);
		String deleteEmployee(int id);
		List<Employee> listEmployees();
	}