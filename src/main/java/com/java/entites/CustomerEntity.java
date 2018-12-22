package com.java.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customer_entity")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private int customerAge;
	private String customerEmail;
	private String customerAddress;
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerEntity(int customerId, String customerName, int customerAge, String customerEmail,
			String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerAge="
				+ customerAge + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

}
