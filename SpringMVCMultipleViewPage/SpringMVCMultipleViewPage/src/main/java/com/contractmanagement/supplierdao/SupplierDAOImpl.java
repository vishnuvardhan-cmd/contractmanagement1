package com.contractmanagement.supplierdao;

//import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.contractmanagement.roleselection1.Supplier;

public class SupplierDAOImpl implements SupplierDAO {
	private JdbcTemplate jdbcTemplate;
	private Supplier supplier;
	private SupplierRowMapper rowMapper;
	public SupplierRowMapper getRowMapper() {
		return rowMapper;
	}
	public void setRowMapper(SupplierRowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/*public SupplierDAOImpl(DataSource dataSource)
	{
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}*/
	/*public int save(Supplier supplier) {
		String sql="insert into supplier(FirstName,LastName,Age,Gender,ContactNumber,SuppilerId,Password)values(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,supplier.getFirstName(),supplier.getLastName(),supplier.getAge(),supplier.getGender(),supplier.getContactNumber(),supplier.getSupplierId(),supplier.getPassword());
		
	}*/
	public int save(com.contractmanagement.roleselection1.Supplier supplier) {
		String sql="insert into supplier(FirstName,LastName,Age,Gender,ContactNumber,SuppilerId,Password)values(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,supplier.getFirstName(),supplier.getLastName(),supplier.getAge(),supplier.getGender(),supplier.getContactNumber(),supplier.getSupplierId(),supplier.getPassword());
	}
	public Supplier read(int id) {
		String sql="select * from supplier where SuppilerId=?";
		//SupplierRowMapper rowMapper =new SupplierRowMapper();
		supplier = (com.contractmanagement.roleselection1.Supplier) jdbcTemplate.queryForObject(sql, rowMapper,id);
		
		return supplier;

	}
	}
