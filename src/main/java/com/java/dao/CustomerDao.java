package com.java.dao;

import java.util.List;

import com.java.entites.CustomerEntity;

public interface CustomerDao {
	boolean addCustomer(CustomerEntity customerEntity);
	CustomerEntity getCustomer(int customerId);
	CustomerEntity deleteCustomer(int customerId);
	CustomerEntity updateCustomer(CustomerEntity customerEntity);
	List<CustomerEntity> getAllCustomers();
	

}
