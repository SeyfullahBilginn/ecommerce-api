package com.example.check24.controller;

import com.example.check24.model.Customer;
import com.example.check24.repository.CustomerRepository;
import com.example.check24.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @PostMapping("/add_customer")
    public ResponseEntity addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
