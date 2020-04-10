package com.contractmanagement.supplierdao;

import com.contractmanagement.roleselection1.Supplier;
public interface SupplierDAO {
	public int save(com.contractmanagement.roleselection1.Supplier s);
	com.contractmanagement.roleselection1.Supplier read(int id);
	
}
