package com.example.acciokartservice.service;

import com.example.acciokartservice.model.customer;
import com.example.acciokartservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    public customer addCustomer(customer customer) {
        return customerRepository.save(customer);
    }
}
