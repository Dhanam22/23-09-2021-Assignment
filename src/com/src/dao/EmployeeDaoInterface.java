package com.src.dao;

import java.util.List;

import com.src.model.Employee;

public interface EmployeeDaoInterface {

		public int saveEmployee(Employee b);
		public int updateEmployee(Employee b);
		public int deleteEmployee(Employee b);
		public List<Employee> displayAllEmployee();

}
