package com.ntg.customermanagementapi.Repository;

import com.ntg.customermanagementapi.Entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

    private final List<Customer> customers = new ArrayList<>(
            List.of(
                    new Customer(1L, "Alice", "alice@example.com"),
                    new Customer(2L, "Bob", "bob@example.com")
            )
    );

    public Customer findById(Long id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Customer> findAllCustomer() {
        return customers;
    }

    public List<Customer> addCustomer(Customer customer) {
        boolean exist = customers.stream().anyMatch(c -> c.getId().equals(customer.getId()));
        if (!exist){
            customers.add(customer);
        }

            return customers;


    }
    public Customer updateCustomerById(Long id , Customer updated){
        boolean exist= customers.stream().anyMatch(c->c.getId().equals(updated.getId()));
        if(exist){
            customers.add(updated);
        }
        return findById(id);
    }
    public List<Customer> deleteCustomerById(Long id){
       customers.removeIf(customer -> customer.getId().equals(id));
       return customers;
    }
    public Customer searchByName(String name){
        Customer customer= customers.stream()
                .filter(c -> c.getCustomerName().equals(name))
                .findFirst().orElse(null);

        return customer;

    }
}


