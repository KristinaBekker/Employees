package com.test.employees.dao.internal;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.employees.dao.EmployeesDao;
import com.test.employees.model.EmployeesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeesDaoImpl implements EmployeesDao {

	@Autowired
	private DataSource dataSource;


	@Override
	public List<EmployeesEntity> getEmployees() {
		List<EmployeesEntity> result = new ArrayList<EmployeesEntity>();
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from employees");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				EmployeesEntity item = new EmployeesEntity();
				item.setId(rs.getLong("id"));
				item.setName(rs.getString("name"));
				item.setDepartment(rs.getString("department"));
				item.setPosition(rs.getString("position"));
				item.setEmail(rs.getString("email"));
				item.setAge(rs.getLong("age"));

				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
