package com.droidnova.restwithhibernate;

import com.droidnova.restwithhibernate.entity.Customer;
import com.droidnova.restwithhibernate.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RestWithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWithHibernateApplication.class, args);
	}

}
