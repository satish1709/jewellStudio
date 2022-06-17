package com.jwelltechno.models;


import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customer_Id")
	private int customer_id;
	
	@Column(name = "First_Name")
	private String first_name;
	
	@Column(name = "Last_Name")
	private String last_name;
	
	@Column(name = "Phone_Number")
	private String phone_number;
	
	@OneToOne
	private Address address;
	
	@Column(name = "Email", unique = true)
	private String email;
	
	@Column(name = "PAN_Number", unique = true, length = 10)
	private String pan_number;
	
	@Column(name = "AADHAR_Number", unique = true)
	private String aadhar_number;
	
	@Lob
	private byte[] aadhar_photo;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customer_id, String first_name, String last_name, String phone_number, Address address,
			String email, String pan_number, String aadhar_number, byte[] aadhar_photo) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.address = address;
		this.email = email;
		this.pan_number = pan_number;
		this.aadhar_number = aadhar_number;
		this.aadhar_photo = aadhar_photo;
	}

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public String getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(String aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public byte[] getAadhar_photo() {
		return aadhar_photo;
	}
	public void setAadhar_photo(byte[] aadhar_photo) {
		this.aadhar_photo = aadhar_photo;
	}
	
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", phone_number=" + phone_number + ", address=" + address + ", email=" + email + ", pan_number="
				+ pan_number + ", aadhar_number=" + aadhar_number + ", aadhar_photo=" + Arrays.toString(aadhar_photo)
				+ "]";
	}
}
