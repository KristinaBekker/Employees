package com.test.employees.dao;

import java.sql.SQLException;
import java.util.List;

import com.test.employees.model.EmployeesEntity;

public interface EmployeesDao {

	/**
	 * Returns list of employees from the given department
	 *
	 * @param department
	 * 		value of department, can be <tt>null</tt> .
	 * @return list of employees from the given department,
	 * if department is <tt>null</tt> returns all employees
	 */
	List<EmployeesEntity> getEmployees(String department);
}
