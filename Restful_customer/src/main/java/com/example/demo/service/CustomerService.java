package com.example.demo.service;

import com.example.demo.Entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> findAll();

    Optional<Customer> findById(long idCustomer);

    void save(Customer customer);

    void deleted(long idCustomer);
}
