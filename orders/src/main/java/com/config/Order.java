package com.config;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;


@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NonNull
	private String orderNo = Long.toHexString(Double.doubleToLongBits(Math.random()));;
	@NonNull
	private String storeId;
	@NonNull
	private String storeName;
	@NonNull
	private String storeAddress;
	@NonNull
	private String customerEmail;
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

	public int getId() {
		return id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public Order() {

	}
	public Order(String storeId, String storeName, String storeAddress, String customerEmail,
			String shippingAddressLine1, String shippingAddressCountry, String shippingAddressLine2,
			String shippingAddressState, String shippingAddressPincode, String shippingPhone,
			String billingAddressLine1, String billingAddressCountry, String billingAddressLine2,
			String billingAddressState, String billingAddressPincode, String billingPhone, String orderStatus) {
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.customerEmail = customerEmail;
		this.shippingAddressLine1 = shippingAddressLine1;
		this.shippingAddressCountry = shippingAddressCountry;
		this.shippingAddressLine2 = shippingAddressLine2;
		this.shippingAddressState = shippingAddressState;
		this.shippingAddressPincode = shippingAddressPincode;
		this.shippingPhone = shippingPhone;
		this.billingAddressLine1 = billingAddressLine1;
		this.billingAddressCountry = billingAddressCountry;
		this.billingAddressLine2 = billingAddressLine2;
		this.billingAddressState = billingAddressState;
		this.billingAddressPincode = billingAddressPincode;
		this.billingPhone = billingPhone;
		this.orderStatus = OrderStatus.valueOf(orderStatus.toUpperCase());
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
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
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}


}
