package com.contractmanagement.contractadmindao;

import java.util.List;

import com.contractmanagement.roleselection1.Status;
import com.contractmanagement.roleselection1.SupplierProposal;

public interface ContractAdminDAO {
	public int save(com.contractmanagement.roleselection1.ContractAdmin admin);
	com.contractmanagement.roleselection1.ContractAdmin read(int id);
	public int saveapprove(int id,String status);
	public int saverejected(int id,String status);
	int update(int id,String status);
	public List<Status> listAll(int id);
}
