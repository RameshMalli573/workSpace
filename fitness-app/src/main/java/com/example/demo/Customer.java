package com.example.demo;

public class Customer {
	private String name;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	private String email;
	public Customer(String name, String city, String state, String country, String pinCode, String email) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public String getEmail() {
		return email;
	}
	
}
