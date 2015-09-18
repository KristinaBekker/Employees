package com.test.employees.service;

import java.util.Collection;

import com.test.employees.model.EmployeesEntity;

public interface EmployeesService {
	Collection<EmployeesEntity> getEmployees();
}
