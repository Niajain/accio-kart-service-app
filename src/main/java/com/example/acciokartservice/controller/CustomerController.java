package com.example.acciokartservice.controller;


import com.example.acciokartservice.model.customer;
import com.example.acciokartservice.repository.CustomerRepository;
import com.example.acciokartservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/add")
    public customer addCustomer(@RequestBody customer cst){
        return customerService.addCustomer(cst);
    }
}
