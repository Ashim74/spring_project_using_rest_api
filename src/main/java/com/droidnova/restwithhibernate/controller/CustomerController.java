package com.droidnova.restwithhibernate.controller;


import com.droidnova.restwithhibernate.entity.Customer;
import com.droidnova.restwithhibernate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.getAllCustomer();
    }

}
