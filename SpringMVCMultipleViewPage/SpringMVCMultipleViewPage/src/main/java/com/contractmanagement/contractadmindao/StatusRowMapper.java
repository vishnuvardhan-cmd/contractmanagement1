package com.contractmanagement.contractadmindao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.contractmanagement.roleselection1.Status;
import com.contractmanagement.roleselection1.SupplierProposal;

public class StatusRowMapper implements RowMapper<Status>{

	public Status mapRow(ResultSet rs, int rowNum) throws SQLException {
		Status r=new Status();
		r.setId(rs.getInt("id"));
		r.setStatus(rs.getString("status"));
		return r;
	}

}
