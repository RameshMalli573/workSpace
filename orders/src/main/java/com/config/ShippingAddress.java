package com.config;

import org.springframework.lang.NonNull;

public class ShippingAddress {
	@NonNull
	private String shippingAddressLine1;
	@NonNull
	private String shippingAddressCountry;
	@NonNull
	private String shippingAddressLine2;
	@NonNull
	private String shippingAddressState;
	@NonNull
	private String shippingAddressPincode;
	@NonNull
	private String shippingPhone;

	public ShippingAddress() {
		
	}

	public ShippingAddress(String shippingAddressLine1, String shippingAddressCountry, String shippingAddressLine2,
			String shippingAddressState, String shippingAddressPincode, String shippingPhone) {
		this.shippingAddressLine1 = shippingAddressLine1;
		this.shippingAddressCountry = shippingAddressCountry;
		this.shippingAddressLine2 = shippingAddressLine2;
		this.shippingAddressState = shippingAddressState;
		this.shippingAddressPincode = shippingAddressPincode;
		this.shippingPhone = shippingPhone;
	}

	public String getShippingAddressLine1() {
		return shippingAddressLine1;
	}

	public void setShippingAddressLine1(String shippingAddressLine1) {
		this.shippingAddressLine1 = shippingAddressLine1;
	}

	public String getShippingAddressCountry() {
		return shippingAddressCountry;
	}

	public void setShippingAddressCountry(String shippingAddressCountry) {
		this.shippingAddressCountry = shippingAddressCountry;
	}

	public String getShippingAddressLine2() {
		return shippingAddressLine2;
	}

	public void setShippingAddressLine2(String shippingAddressLine2) {
		this.shippingAddressLine2 = shippingAddressLine2;
	}

	public String getShippingAddressState() {
		return shippingAddressState;
	}

	public void setShippingAddressState(String shippingAddressState) {
		this.shippingAddressState = shippingAddressState;
	}

	public String getShippingAddressPincode() {
		return shippingAddressPincode;
	}

	public void setShippingAddressPincode(String shippingAddressPincode) {
		this.shippingAddressPincode = shippingAddressPincode;
	}

	public String getShippingPhone() {
		return shippingPhone;
	}

	public void setShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
	}
}
