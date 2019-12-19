package com.thymeleaf.demo.QLKH.Service;

import com.thymeleaf.demo.QLKH.Model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    void update(int idCustomer, Customer customer);
    Customer findById(int idCustomer);
    void remove(int idCustomer);

}
