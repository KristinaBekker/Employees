package com.test.employees.dao;

import java.util.List;

import com.test.employees.model.EmployeesEntity;

public interface EmployeesDao {

	List<EmployeesEntity> getEmployees();
}
