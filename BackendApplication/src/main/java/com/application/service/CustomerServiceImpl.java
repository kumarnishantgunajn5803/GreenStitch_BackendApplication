package com.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.exception.CustomerException;
import com.application.model.Customer;
import com.application.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		
		return customerRepository.save(customer);
		
		
	}

	@Override
	public Customer getCustomerDetailsByEmail(String email)throws CustomerException {
		
		return customerRepository.findByEmail(email).orElseThrow(() -> new CustomerException("Customer Not found with Email: "+email));
	}

	 

 

}

