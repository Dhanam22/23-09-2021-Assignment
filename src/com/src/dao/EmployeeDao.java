package com.src.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.src.model.Employee;

public class EmployeeDao implements EmployeeDaoInterface {
	
private JdbcTemplate jdbctemp;
	
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	@Override
	public int saveEmployee(Employee b) {
		String query="insert into Employee values("+b.getId()+",'"+b.getName()+"','"+b.getDateofbirth()+"',"+b.getSalary()+",'"+b.getDesignation()+"','"+b.getStartdate()+"','"+b.getEnddate()+"')";
		return jdbctemp.update(query);
	}

	@Override
	public int updateEmployee(Employee b) {
		String query="update employee set name='"+b.getName()+"',dateofbirth='"+b.getDateofbirth()+"',salary="+b.getSalary()+",designation='"+b.getDesignation()+"',startdate='"+b.getStartdate()+"',enddate='"+b.getEnddate()+"' where Id="+b.getId();
		return jdbctemp.update(query);
	}

	@Override
	public int deleteEmployee(Employee b) {
		String query="delete from Employee where Id="+b.getId();
		return jdbctemp.update(query);
	}

	@Override
	public List<Employee> displayAllEmployee() {
		return jdbctemp.query("select * from Employee",(rs,row)->
		{
			Employee b= new Employee();
			b.setId(rs.getInt(1));
			b.setName(rs.getString(2));
			b.setDateofbirth(rs.getString(3));
			b.setSalary(rs.getInt(4));
			b.setDesignation(rs.getString(5));
			b.setStartdate(rs.getString(6));
			b.setEnddate(rs.getString(7));
			return b;
		});
		
		
	}
	

}
