package com.droidnova.restwithhibernate.repo;

import com.droidnova.restwithhibernate.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
