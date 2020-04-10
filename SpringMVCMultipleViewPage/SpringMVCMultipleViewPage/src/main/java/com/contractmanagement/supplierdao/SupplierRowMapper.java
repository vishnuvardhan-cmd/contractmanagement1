package com.contractmanagement.supplierdao;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//import com.contractmanagement.controle.ControllerMain;
import com.contractmanagement.roleselection1.Supplier;
public class SupplierRowMapper implements RowMapper<Supplier>{
	private Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
		//Supplier supplier = new Supplier(rs.getString("FirstName"),rs.getString("LastName"),rs.getInt("Age"),rs.getString("Gender"),rs.getString("ContactNumber"),rs.getInt("SuppilerId"),rs.getString("Password"));
		//ControllerMain mai=new ControllerMain();
		System.out.println(rs.getString("FirstName"));
		System.out.println(rs.getString("LastName"));
		supplier.setFirstName(rs.getString("FirstName"));
		supplier.setLastName(rs.getString("LastName"));
		supplier.setAge(rs.getInt("Age"));
		supplier.setGender(rs.getString("Gender"));
		supplier.setContactNumber(rs.getString("ContactNumber"));
		supplier.setSupplierId(rs.getInt("SuppilerId"));
		supplier.setPassword(rs.getString("Password"));
		System.out.println(supplier.getSupplierId());
		System.out.println(supplier.getFirstName());
		//mai.setId(supplier.getSupplierId());
		//mai.setPassword(supplier.getPassword());
        return supplier;
	}
	

}
