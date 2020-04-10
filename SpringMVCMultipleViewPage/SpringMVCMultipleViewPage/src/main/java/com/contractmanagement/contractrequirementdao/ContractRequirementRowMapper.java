package com.contractmanagement.contractrequirementdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.contractmanagement.roleselection1.ContractRequirement;

public class ContractRequirementRowMapper implements RowMapper<ContractRequirement>{
	
	public ContractRequirement mapRow(ResultSet rs, int rowNum) throws SQLException {
		ContractRequirement r=new ContractRequirement();
		r.setRequirementid(rs.getInt("requirementid"));
		r.setRequirementtype(rs.getString("requirementtype"));
		r.setRequirementdescription(rs.getString("requirementdescription"));
		r.setDate(rs.getString("deliverydate"));
		return r;
	}

}
