package com.droidnova.restwithhibernate.service;

import com.droidnova.restwithhibernate.entity.Customer;
import com.droidnova.restwithhibernate.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }


    public Optional<Customer> getById(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer;
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Optional<Customer> existingCustomer = customerRepository.findById(id);

        if (existingCustomer.isPresent()) {
            Customer customerToUpdate = existingCustomer.get();
            customerToUpdate.setName(updatedCustomer.getName());
            customerToUpdate.setEmail(updatedCustomer.getEmail());

            return customerRepository.save(customerToUpdate);
        } else {
            // Handle case where customer with the given id is not found
            throw new NoSuchElementException("Customer with ID " + id + " not found");
        }
    }

    public boolean deleteCustomer(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isPresent()) {
            customerRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
