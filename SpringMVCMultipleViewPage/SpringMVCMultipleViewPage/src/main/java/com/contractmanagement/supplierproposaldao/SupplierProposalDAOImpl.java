package com.contractmanagement.supplierproposaldao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.contractmanagement.contractrequirementdao.ContractRequirementRowMapper;
import com.contractmanagement.roleselection1.ContractRequirement;
import com.contractmanagement.roleselection1.SupplierProposal;

public class SupplierProposalDAOImpl implements SupplierProposaldao {
	private JdbcTemplate jdbcTemplate;
	private SupplierProposal proposal;
	public SupplierProposal getProposal() {
		return proposal;
	}
	public void setProposal(SupplierProposal proposal) {
		this.proposal = proposal;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(SupplierProposal sp) {
		String sql="insert into supplierproposal(proposalid,requirementid,proposaldate,quotation)values(?,?,?,?)";
		return jdbcTemplate.update(sql,sp.getProposalid(),sp.getRequirementid(),sp.getProposaldate(),sp.getQuotation());
	}
	public List<SupplierProposal> listAll() {
		String sql="select * from supplierproposal";
		SupplierProposalRowMapper rowMapper = new SupplierProposalRowMapper();
		List<SupplierProposal> query = jdbcTemplate.query(sql,rowMapper);
		return query;
	}


}
