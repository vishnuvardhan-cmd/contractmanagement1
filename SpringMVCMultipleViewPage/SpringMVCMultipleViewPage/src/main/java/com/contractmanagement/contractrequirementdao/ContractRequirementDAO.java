package com.contractmanagement.contractrequirementdao;

import java.util.List;

import com.contractmanagement.roleselection1.ContractRequirement;

public interface ContractRequirementDAO {
	public int save(com.contractmanagement.roleselection1.ContractRequirement requirement);
	public List<ContractRequirement> listAll();
}
