package com.contractmanagement.supplierproposaldao;

import java.util.List;

import com.contractmanagement.roleselection1.ContractRequirement;
import com.contractmanagement.roleselection1.SupplierProposal;

public interface SupplierProposaldao {
	public int save(com.contractmanagement.roleselection1.SupplierProposal sp);
	public List<SupplierProposal> listAll();
}
