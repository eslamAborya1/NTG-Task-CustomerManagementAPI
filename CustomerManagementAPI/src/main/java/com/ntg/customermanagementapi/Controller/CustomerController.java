package com.ntg.customermanagementapi.Controller;

import com.ntg.customermanagementapi.Entity.Customer;
import com.ntg.customermanagementapi.Service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers (){
        return customerService.getAllCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);

    }
    @PostMapping("/add")
    public List<Customer> addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    @PutMapping("/update/{id}")
    public Customer updateCustomer (@PathVariable Long id,@RequestBody Customer customer){
        return customerService.updateCustomerById(id,customer);
    }
    @DeleteMapping("/delete/{id}")
    public List<Customer> deleteCustomerById(@PathVariable Long id){
        return customerService.deleteCustomerById(id);

    }
    @GetMapping("/get/{name}")
    public Customer getCustomerByName(@PathVariable String name){
        return customerService.getCustomerByName(name);
    }

}
