package com.codegym.repository.service.impl;

import com.codegym.repository.entity.Customer;
import com.codegym.repository.repository.RepositoryCustomer;
import com.codegym.repository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
   @Autowired
    RepositoryCustomer repositoryCustomer;

    @Override
    public Iterable<Customer> getAllCustomer() {
        return repositoryCustomer.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return repositoryCustomer.findById(id).orElse(null);
    }

    @Override
    public void deleted(Long id) {
        repositoryCustomer.deleteById(id);

    }

    @Override
    public void save(Customer customer) {
        repositoryCustomer.save(customer);

    }
}
