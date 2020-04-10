package com.contractmanagement.supplierproposaldao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.contractmanagement.roleselection1.ContractRequirement;
import com.contractmanagement.roleselection1.SupplierProposal;

public class SupplierProposalRowMapper implements RowMapper<SupplierProposal>{

	public SupplierProposal mapRow(ResultSet rs, int rowNum) throws SQLException {
		SupplierProposal r=new SupplierProposal();
		r.setProposalid(rs.getInt("proposalid"));
		r.setRequirementid(rs.getInt("requirementid"));
		r.setProposaldate(rs.getString("proposaldate"));
		r.setQuotation(rs.getString("quotation"));
		return r;
	}

}
