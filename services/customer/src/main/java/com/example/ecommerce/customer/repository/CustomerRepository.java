package com.example.ecommerce.customer.repository;

import com.example.ecommerce.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
