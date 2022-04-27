package com.rakuten;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	private static int account_counter = 10001;

	private enum Type {
		SAVINGS, DEMAT, CURRENT;
	}

	private enum Status {
		ACTIVE, INACTIVE, CLOSED;
	}


	private String name;
	private String age;
	private String mobileNumber;
	private int accountNumber = this.generateNewAccountNumber();
	private Type type;
	private Status status;
	private String city;
	private String state;

	private int generateNewAccountNumber() {
		return account_counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getAccount() {
		return accountNumber;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getType() {
		return type.name();
	}

	public void setType(String type) {
		this.type = Type.valueOf(type.toUpperCase());
	}

	public String getStatus() {
		return status.name();

	}

	public void setStatus(String status) {
		this.status = Status.valueOf(status.toUpperCase());
	}

}
