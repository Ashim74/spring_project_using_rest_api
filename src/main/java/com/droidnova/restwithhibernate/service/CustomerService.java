package com.droidnova.restwithhibernate.service;

import com.droidnova.restwithhibernate.entity.Customer;
import com.droidnova.restwithhibernate.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }


}
