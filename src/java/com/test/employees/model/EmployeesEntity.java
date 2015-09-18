package com.test.employees.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "com/test/employees")
public class EmployeesEntity {

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "position")
	private String position;

	@Column(name = "department")
	private String department;

	@Column(name = "email")
	private String email;

	@Column(name = "age")
	private Long age;

	public EmployeesEntity() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
}
