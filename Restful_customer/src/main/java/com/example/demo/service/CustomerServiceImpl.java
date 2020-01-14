package com.example.demo.service;

import com.example.demo.Entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
    @Override
    public Optional<Customer> findById(long idCustomer){
        return customerRepository.findById(idCustomer);
    }
    @Override
    public void save(Customer customer){
        customerRepository.save(customer);
    }
    @Override
    public void deleted(long idCustomer){
        customerRepository.deleteById(idCustomer);
    }
}
