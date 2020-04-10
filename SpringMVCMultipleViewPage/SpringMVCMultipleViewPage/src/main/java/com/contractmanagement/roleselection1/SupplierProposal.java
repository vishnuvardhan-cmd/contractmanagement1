package com.contractmanagement.roleselection1;

public class SupplierProposal {
	private int proposalid;
	private int requirementid;
	private String proposaldate;
	private String quotation;
	public int getProposalid() {
		return proposalid;
	}
	public void setProposalid(int proposalid) {
		this.proposalid = proposalid;
	}
	public int getRequirementid() {
		return requirementid;
	}
	public void setRequirementid(int requirementid) {
		this.requirementid = requirementid;
	}
	public String getProposaldate() {
		return proposaldate;
	}
	public void setProposaldate(String proposaldate) {
		this.proposaldate = proposaldate;
	}
	public String getQuotation() {
		return quotation;
	}
	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}
	public SupplierProposal(int proposalid, int requirementid, String proposaldate, String quotation) {
		super();
		this.proposalid = proposalid;
		this.requirementid = requirementid;
		this.proposaldate = proposaldate;
		this.quotation = quotation;
	}
	public SupplierProposal() {
		super();
	}
	

}
