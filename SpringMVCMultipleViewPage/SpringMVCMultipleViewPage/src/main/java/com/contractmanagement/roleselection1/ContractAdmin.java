package com.contractmanagement.roleselection1;

public class ContractAdmin {
	private String FirstName;
	private String LastName;
	private int Age;
	private String Gender;
	private String ContactNumber;
	private int SupplierId;
	private String Password;
	public ContractAdmin()
	{
		
	}
	public ContractAdmin(String firstName, String lastName, int age, String gender, String contactNumber,
			int supplierId, String password) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
		this.Gender = gender;
		this.ContactNumber = contactNumber;
		this.SupplierId = supplierId;
		this.Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.ContactNumber = contactNumber;
	}
	public int getSupplierId() {
		return SupplierId;
	}
	public void setSupplierId(int supplierId) {
		this.SupplierId = supplierId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}

}
