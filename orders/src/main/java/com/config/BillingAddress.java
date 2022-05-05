package com.config;

import java.util.Date;

import org.springframework.lang.NonNull;

public class BillingAddress {
	@NonNull
	private String billingAddressLine1;
	@NonNull
	private String billingAddressCountry;
	@NonNull
	private String billingAddressLine2;
	@NonNull
	private String billingAddressState;
	@NonNull
	private String billingAddressPincode;
	@NonNull
	private String billingPhone;
	
	private enum OrderStatus{
		SHIPPED ,CLOSED, CANCELLED, REJECTED, RETURED, REPLACED		
	}
	private OrderStatus orderStatus;
	public BillingAddress() {
		
	}
	public String getBillingAddressLine1() {
		return billingAddressLine1;
	}

	public void setBillingAddressLine1(String billingAddressLine1) {
		this.billingAddressLine1 = billingAddressLine1;
	}

	public String getBillingAddressCountry() {
		return billingAddressCountry;
	}

	public void setBillingAddressCountry(String billingAddressCountry) {
		this.billingAddressCountry = billingAddressCountry;
	}

	public String getBillingAddressLine2() {
		return billingAddressLine2;
	}

	public void setBillingAddressLine2(String billingAddressLine2) {
		this.billingAddressLine2 = billingAddressLine2;
	}

	public String getBillingAddressState() {
		return billingAddressState;
	}

	public void setBillingAddressState(String billingAddressState) {
		this.billingAddressState = billingAddressState;
	}

	public String getBillingAddressPincode() {
		return billingAddressPincode;
	}

	public void setBillingAddressPincode(String billingAddressPincode) {
		this.billingAddressPincode = billingAddressPincode;
	}

	public String getBillingPhone() {
		return billingPhone;
	}

	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	Date lastUpdated;

	public BillingAddress(String billingAddressLine1, String billingAddressLine2, String billingAddressState,
			String billingAddressCountry, String billingAddressPincode, String billingPhone,String orderStatus) {
		this.billingAddressLine1 = billingAddressLine1;
		this.billingAddressLine2 = billingAddressLine2;
		this.billingAddressState = billingAddressState;
		this.billingAddressCountry = billingAddressCountry;
		this.billingAddressPincode = billingAddressPincode;
		this.billingPhone = billingPhone;
		this.orderStatus = OrderStatus.valueOf(orderStatus.toUpperCase());
	}
	public String getOrderStatus() {
		return orderStatus.toString();
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = OrderStatus.valueOf(orderStatus.toUpperCase());
	}
}
