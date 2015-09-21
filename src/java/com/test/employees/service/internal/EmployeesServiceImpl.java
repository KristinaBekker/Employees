package com.test.employees.service.internal;

import java.util.List;

import com.test.employees.dao.EmployeesDao;
import com.test.employees.model.EmployeesEntity;
import com.test.employees.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	private EmployeesDao employeesDao;

	@Override
	public List<EmployeesEntity> getEmployees(String department) {
		return employeesDao.getEmployees(department);
	}

//	public void setEmployeesDao(EmployeesDao employeesDao) {
//		this.employeesDao = employeesDao;
//	}

//	public EmployeesDao getEmployeesDao() {
//		return employeesDao;
//	}
}
