package com.contractmanagement.contractadmindao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.contractmanagement.roleselection1.ContractAdmin;
import com.contractmanagement.roleselection1.Status;
import com.contractmanagement.roleselection1.Supplier;
import com.contractmanagement.roleselection1.SupplierProposal;
import com.contractmanagement.supplierdao.SupplierRowMapper;
import com.contractmanagement.supplierproposaldao.SupplierProposalRowMapper;

public class ContractAdminDAOImpl implements ContractAdminDAO {
	private JdbcTemplate jdbcTemplate;
	private ContractAdmin contractAdmin;
	private ContractAdminRowMapper rowMapper;
	public ContractAdminRowMapper getRowMapper() {
		return rowMapper;
	}
	public void setRowMapper(ContractAdminRowMapper rowMapper) {
		this.rowMapper = rowMapper;
	}
	public ContractAdmin getContractAdmin() {
		return contractAdmin;
	}
	public void setContractAdmin(ContractAdmin contractAdmin) {
		this.contractAdmin = contractAdmin;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(ContractAdmin admin) {
		String sql="insert into contractadmin(FirstName,LastName,Age,Gender,ContactNumber,SuppilerId,Password)values(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,admin.getFirstName(),admin.getLastName(),admin.getAge(),admin.getGender(),admin.getContactNumber(),admin.getSupplierId(),admin.getPassword());
		
	}
	public ContractAdmin read(int id) {
		String sql="select * from contractadmin where SuppilerId=?";
		//ContractAdminRowMapper rowMapper =new ContractAdminRowMapper();
		contractAdmin = (com.contractmanagement.roleselection1.ContractAdmin) jdbcTemplate.queryForObject(sql, rowMapper,id);
		
		return contractAdmin;
	}
	public int saveapprove(int id, String status) {
		String sql="insert into approve(id,status)values(?,?)";
		return jdbcTemplate.update(sql,id,status);
		
	}
	public int saverejected(int id, String status) {
		String sql="insert into reject(id,status)values(?,?)";
		return jdbcTemplate.update(sql,id,status);
	}
	public int update(int id, String status) {
		String sql="update approve set status=? where id=?";
		int update = jdbcTemplate.update(sql,status,id);
		return update;
	}
	public List<Status> listAll(int id) {
		String sql="select * from approve where id=?";
		StatusRowMapper rowMapper = new StatusRowMapper();
		List<Status> query = jdbcTemplate.query(sql,rowMapper,id);
		return query;
	}

}
