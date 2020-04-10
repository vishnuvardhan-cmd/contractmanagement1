package com.contractmanagement.createcontractdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.contractmanagement.roleselection1.CreateContract;
import com.contractmanagement.roleselection1.Status;

public class ContractRowMapper implements RowMapper<CreateContract>{

	public CreateContract mapRow(ResultSet rs, int rowNum) throws SQLException {
		CreateContract r=new CreateContract();
		r.setContractid(rs.getInt("contractid"));
		r.setContracttype(rs.getString("contracttype"));
		r.setContractduration(rs.getString("contractduration"));
		return r;
	}

}
