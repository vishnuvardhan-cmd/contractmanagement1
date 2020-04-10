package com.contractmanagement.roleselection1;

public class ContractRequirement {
	private int requirementid;
	private String requirementtype;
	private String requirementdescription;
	private String date;
	public ContractRequirement() {
		super();
	}
	public ContractRequirement(int requirementid, String requirementtype, String requirementdescription, String date) {
		super();
		this.requirementid = requirementid;
		this.requirementtype = requirementtype;
		this.requirementdescription = requirementdescription;
		this.date = date;
	}
	public int getRequirementid() {
		return requirementid;
	}
	public void setRequirementid(int requirementid) {
		this.requirementid = requirementid;
	}
	public String getRequirementtype() {
		return requirementtype;
	}
	public void setRequirementtype(String requirementtype) {
		this.requirementtype = requirementtype;
	}
	public String getRequirementdescription() {
		return requirementdescription;
	}
	public void setRequirementdescription(String requirementdescription) {
		this.requirementdescription = requirementdescription;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
