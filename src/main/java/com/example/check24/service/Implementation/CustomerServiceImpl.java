package com.example.check24.service.Implementation;

import com.example.check24.model.Customer;
import com.example.check24.repository.CustomerRepository;
import com.example.check24.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public ResponseEntity addCustomer(Customer customer) {
        try {
            Customer savedCustomer = customerRepository.save(customer);
            return new ResponseEntity<>(Collections.singletonMap("info", savedCustomer), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Collections.singletonMap("error", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
