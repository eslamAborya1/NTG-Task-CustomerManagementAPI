package com.ntg.customermanagementapi.Service;

import com.ntg.customermanagementapi.Entity.Customer;
import com.ntg.customermanagementapi.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById (Long id){
        return customerRepository.findById(id);
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAllCustomer();
    }
    public List<Customer> addCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

    public Customer updateCustomerById(Long id , Customer updated){

        return customerRepository.updateCustomerById(id,updated);
    }
    public List<Customer> deleteCustomerById(Long id){
        return customerRepository.deleteCustomerById(id);

    }
    public Customer getCustomerByName(String name){
        return customerRepository.searchByName(name);
    }


}
