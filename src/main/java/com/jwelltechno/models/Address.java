package com.jwelltechno.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Column(name = "Area")
	private String area;
	@Column(name = "City")
	private String city;
	@Column(name = "State")
	private String state;
	@Id
	@Column(name = "ZIP_code")
	private String zip_code;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public Address(String area, String city, String state, String zip_code) {
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", state=" + state + ", zip_code=" + zip_code + "]";
	}

}
