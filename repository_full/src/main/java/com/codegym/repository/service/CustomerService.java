package com.codegym.repository.service;

import com.codegym.repository.entity.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> getAllCustomer();
    Customer findById(Long id);
    void deleted(Long id);
    void save(Customer customer);
}
