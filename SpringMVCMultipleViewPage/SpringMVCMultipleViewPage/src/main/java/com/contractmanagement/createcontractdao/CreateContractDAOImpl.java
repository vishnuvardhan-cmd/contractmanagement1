package com.contractmanagement.createcontractdao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.contractmanagement.contractadmindao.StatusRowMapper;
import com.contractmanagement.roleselection1.CreateContract;
import com.contractmanagement.roleselection1.Status;
import com.contractmanagement.roleselection1.Supplier;

public class CreateContractDAOImpl implements CreateContractDAO{
	private JdbcTemplate jdbcTemplate;
	private CreateContract cc;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public CreateContract getCc() {
		return cc;
	}
	public void setCc(CreateContract cc) {
		this.cc = cc;
	}
	public int save(CreateContract cc) {
		String sql="insert into contract(contractid,contracttype,contractduration)values(?,?,?)";
		return jdbcTemplate.update(sql,cc.getContractid(),cc.getContracttype(),cc.getContractduration());
	}
	public List<CreateContract> listAll() {
		String sql="select * from contract";
		ContractRowMapper rowMapper = new ContractRowMapper();
		List<CreateContract> query = jdbcTemplate.query(sql,rowMapper);
		return query;
	}

}
