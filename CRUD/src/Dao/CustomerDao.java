package Dao;

import Model.Customer;

import java.util.*;

public class CustomerDao {
    private static Map<Integer, Customer> listCustomer = new HashMap<>();

    static {
        initCustomer();
    }

    private static void initCustomer() {
        Customer cus1 = new Customer(1, "thanh", "1@gamil.com", "quang nam ");
        Customer cus2 = new Customer(2, "dat", "1@gamil.com", "quang nam ");
        Customer cus3 = new Customer(3, "dinh", "1@gamil.com", "quang nam ");
        Customer cus4 = new Customer(4, "trung", "1@gamil.com", "quang nam ");
        listCustomer.put(cus1.getId(), cus1);
        listCustomer.put(cus2.getId(), cus2);
        listCustomer.put(cus3.getId(), cus3);
        listCustomer.put(cus4.getId(), cus4);
    }

    //phuong thuc nhan toan bo customer;
    public static List<Customer> allCustomer() {
        Collection<Customer> c = listCustomer.values();
        List<Customer> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }

    //phuong thuc deleted 1 Customer theo id;
    public static void deleted(int idCustomer) {
        listCustomer.remove(idCustomer);
    }

    //phuong thức nhận thông tin của một customer theo id :
    public static Customer getCustomer(int idCustomer) {
        return listCustomer.get(idCustomer);
    }

    //phuong thuc them moi 1 customer:
    public static void addNewCustomer(Customer customer) {
        listCustomer.put(customer.getId(), customer);

    }



    public static void main(String[] args) {
        initCustomer();
        System.out.println(listCustomer.get(1).getId());
    }

}
