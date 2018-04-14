package com.bridgeit.programs;

public class Person {
	
    private String firstName;
    private String lastName;
    private int phoneNo;
    private Address address;
    
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFiStName() {
		return firstName;
	}
	public void setFiStName(String fiStName) {
		this.firstName = fiStName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + ", address="
				+ address + "]";
	}

}
