package com.thymeleaf.demo.QLKH.Service;

import com.thymeleaf.demo.QLKH.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CustomerServiceIPM implements CustomerService {
    private static Map<Integer,Customer> list;
    static {
        list = new HashMap<>();
        list.put(1, new Customer(1, "thanh", "quang nam", "ntat0204@gmail.com"));
        list.put(2, new Customer(2, "dat", "quang nam", "ntat0204@gmail.com"));
        list.put(3, new Customer(3, "dinh", "quang nam", "ntat0204@gmail.com"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void save(Customer customer) {
        list.put(customer.getId(),customer);
    }

    @Override
    public void update(int idCustomer, Customer customer) {
        list.put(idCustomer,customer);

    }

    @Override
    public Customer findById(int idCustomer) {
        return list.get(idCustomer);
    }

    @Override
    public void remove(int idCustomer) {
        list.remove(idCustomer);

    }
}
