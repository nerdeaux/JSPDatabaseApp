package com.vusi.model;


public class Employee {
	
	private Integer EmployeeID;
	
	private String Full_Name;
	
	private String Telephone_Number;
	
	private String Home_Location;
	
	private String Branch_Name;
	
	private String Branch_Location;

	

	public Integer getEmployeeID() {
		return EmployeeID;
	}



	public void setEmployeeID(Integer employeeID) {
		this.EmployeeID = employeeID;
	}



	public String getFull_Name() {
		return Full_Name;
	}



	public void setFull_Name(String full_Name) {
		this.Full_Name = full_Name;
	}



	public String getTelephone_Number() {
		return Telephone_Number;
	}



	public void setTelephone_Number(String telephone_Number) {
		this.Telephone_Number = telephone_Number;
	}



	public String getHome_Location() {
		return Home_Location;
	}



	public void setHome_Location(String home_Location) {
		this.Home_Location = home_Location;
	}



	public String getBranch_Name() {
		return Branch_Name;
	}



	public void setBranch_Name(String branch_Name) {
		this.Branch_Name = branch_Name;
	}



	public String getBranch_Location() {
		return Branch_Location;
	}



	public void setBranch_Location(String branch_Location) {
		this.Branch_Location = branch_Location;
	}



	@Override
	public String toString() {
		return "Employee [id=" + EmployeeID + ", name=" + Full_Name + ", Tel=" + Telephone_Number + ", "
				+ "Home Address=" + Home_Location + "Branch Name=" + Branch_Name + "Branch_Location=" + Branch_Location +
				", getEmployeeID()=" + getEmployeeID() + ", getFull_Name()=" + getFull_Name() + ", getTelephone_Number()=" + getTelephone_Number() + ", getHome_Location()="
				+ getHome_Location() + ", getBranch_Name()=" + getBranch_Name() + "getBrand_Location()=" + getBranch_Location()+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
