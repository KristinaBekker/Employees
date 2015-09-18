package com.test.employees.service.internal;

import java.util.Collection;

import com.test.employees.dao.EmployeesDao;
import com.test.employees.dao.internal.EmployeesDaoImpl;
import com.test.employees.model.EmployeesEntity;
import com.test.employees.service.EmployeesService;
import org.springframework.transaction.annotation.Transactional;

public class EmployeesServiceImpl implements EmployeesService {
	private EmployeesDao employeesDao;

	@Override
	public Collection<EmployeesEntity> getEmployees() {
		return employeesDao.getEmployees();
	}

	public void setEmployeesDao(EmployeesDao employeesDao) {
		this.employeesDao = employeesDao;
	}

	public EmployeesDao getEmployeesDao() {
		return employeesDao;
	}
}
