package com.contractmanagement.roleselection1;

public class CreateContract {
 private int contractid;
 private String contracttype;
 private String contractduration;
public CreateContract() {
	super();
}
public CreateContract(int contractid, String contracttype, String contractduration) {
	super();
	this.contractid = contractid;
	this.contracttype = contracttype;
	this.contractduration = contractduration;
}
public int getContractid() {
	return contractid;
}
public void setContractid(int contractid) {
	this.contractid = contractid;
}
public String getContracttype() {
	return contracttype;
}
public void setContracttype(String contracttype) {
	this.contracttype = contracttype;
}
public String getContractduration() {
	return contractduration;
}
public void setContractduration(String contractduration) {
	this.contractduration = contractduration;
}
}
