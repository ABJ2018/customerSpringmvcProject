package com.java.service;

import java.util.List;

import com.java.beans.Customer;

public interface CustomerService {
	boolean addCustomer(Customer customer);
	Customer getCustomer(int customerId);
	Customer deleteCustomer(int customerId);
	Customer updateCustomer(Customer customer);
	List<Customer> getAllCustomers();

}
