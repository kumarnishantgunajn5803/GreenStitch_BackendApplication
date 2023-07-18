package com.application.service;

import java.util.List;

import com.application.exception.CustomerException;
import com.application.model.Customer;
 

public interface CustomerService {
	
	public Customer registerCustomer(Customer customer);
	
	public Customer getCustomerDetailsByEmail(String email)throws CustomerException;
	
	 

}

