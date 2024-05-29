package com.example.check24.service;

import com.example.check24.model.Customer;
import org.springframework.http.ResponseEntity;

public interface ICustomerService {
    ResponseEntity addCustomer(Customer customer);
}