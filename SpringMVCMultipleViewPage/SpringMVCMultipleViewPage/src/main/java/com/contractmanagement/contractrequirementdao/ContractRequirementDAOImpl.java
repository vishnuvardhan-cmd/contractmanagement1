package com.contractmanagement.contractrequirementdao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.contractmanagement.roleselection1.ContractRequirement;

public class ContractRequirementDAOImpl implements ContractRequirementDAO {
	private JdbcTemplate jdbcTemplate;
	private ContractRequirement requirement;
	public ContractRequirement getRequirement() {
		return requirement;
	}
	public void setRequirement(ContractRequirement requirement) {
		this.requirement = requirement;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(ContractRequirement requirement) {
		String sql="insert into contractrequirement(requirementid,requirementtype,requirementdescription,deliverydate)values(?,?,?,?)";
		return jdbcTemplate.update(sql,requirement.getRequirementid(),requirement.getRequirementtype(),requirement.getRequirementdescription(),requirement.getDate());
	}
	public List<ContractRequirement> listAll() {
		String sql="select * from contractrequirement";
		ContractRequirementRowMapper rowMapper = new ContractRequirementRowMapper();
		List<ContractRequirement> query = jdbcTemplate.query(sql,rowMapper);
		return query;
	}

}
