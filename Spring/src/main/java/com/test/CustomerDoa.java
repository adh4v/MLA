package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CustomerDoa {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void createCust(Customer cst)
	{
		String sql = "insert into Customer(cst_name,cst_type)values('"+cst.getName()+"','"+cst.getType()+"')";
		
		jdbcTemplate.execute(sql);
	}
	public void updateCust(Customer cst)
	{
		String sql = "update Customer set cst_name = '"+cst.getName()+"' where id=1";
		jdbcTemplate.execute(sql);
	}
	public void deleteCust(Customer cst)
	{
		String sql = "delete from Customer where id=1";
		jdbcTemplate.execute(sql);
	}
	public List<Customer> getAllCustomers()
	{
		return jdbcTemplate.query("select * from Customer", new ResultSetExtractor<List<Customer>>()
				{
					@Override
					public  List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException{
						
						List<Customer> list = new ArrayList<>();
						while(rs.next())
						{
							Customer obj = new Customer();
							obj.setId(rs.getInt(1));
							obj.setName(rs.getString(2));
							obj.setType(rs.getString(3));
							
							list.add(obj);
						}
						return list;
					}
				});
	}
}
