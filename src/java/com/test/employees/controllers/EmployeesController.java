package com.test.employees.controllers;

import java.util.Collection;

import com.test.employees.model.EmployeesEntity;
import com.test.employees.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;


	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Collection<EmployeesEntity> getEmployees(
			@RequestParam(value = "department", required = false) String department) {
		return employeesService.getEmployees(department);
	}
}
