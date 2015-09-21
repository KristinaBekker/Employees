package com.test.employees.dao.internal;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.test.employees.dao.EmployeesDao;
import com.test.employees.model.EmployeesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeesDaoImpl implements EmployeesDao {

	private NamedParameterJdbcOperations namedJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.namedJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<EmployeesEntity> getEmployees(String department) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM employees ");
		if (department != null) {
			sql.append("where department='")
					.append(department)
					.append("'");
		}

		return this.namedJdbcTemplate.getJdbcOperations().query(sql.toString(),
				new RowMapper<EmployeesEntity>() {
					@Override
					public EmployeesEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
						EmployeesEntity item = new EmployeesEntity();
						item.setId(rs.getLong("id"));
						item.setName(rs.getString("name"));
						item.setDepartment(rs.getString("department"));
						item.setPosition(rs.getString("position"));
						item.setEmail(rs.getString("email"));
						item.setAge(rs.getLong("age"));
						return item;
					}
				});
	}
}
