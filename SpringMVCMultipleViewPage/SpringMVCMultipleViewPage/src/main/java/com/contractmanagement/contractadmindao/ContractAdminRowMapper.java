package com.contractmanagement.contractadmindao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.contractmanagement.controle.ContractMain;
import com.contractmanagement.roleselection1.ContractAdmin;
import com.contractmanagement.roleselection1.Supplier;

public class ContractAdminRowMapper implements RowMapper<ContractAdmin>{
	ContractAdmin contractAdmin;
	public ContractAdmin getContractAdmin() {
		return contractAdmin;
	}
	public void setContractAdmin(ContractAdmin contractAdmin) {
		this.contractAdmin = contractAdmin;
	}
	public ContractAdmin mapRow(ResultSet rs, int rowNum) throws SQLException {
		//ContractAdmin contractAdmin= new ContractAdmin(rs.getString("FirstName"),rs.getString("LastName"),rs.getInt("Age"),rs.getString("Gender"),rs.getString("ContactNumber"),rs.getInt("SuppilerId"),rs.getString("Password"));
		//ContractMain mai=new ContractMain();
		System.out.println(rs.getString("FirstName"));
		System.out.println(rs.getString("LastName"));
		contractAdmin.setFirstName(rs.getString("FirstName"));
		contractAdmin.setLastName(rs.getString("LastName"));
		contractAdmin.setAge(rs.getInt("Age"));
		contractAdmin.setGender(rs.getString("Gender"));
		contractAdmin.setContactNumber(rs.getString("ContactNumber"));
		contractAdmin.setSupplierId(rs.getInt("SuppilerId"));
		contractAdmin.setPassword(rs.getString("Password"));
		//mai.ContractAdminDataInformation(rs.getInt("SuppilerId"),rs.getString("Password"));
		System.out.println(contractAdmin.getSupplierId());
		System.out.println(contractAdmin.getFirstName());
		return contractAdmin;
	}

}
