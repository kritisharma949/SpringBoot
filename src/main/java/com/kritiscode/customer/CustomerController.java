package com.kritiscode.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("api/v1/customer")
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers() ;
    }

    @GetMapping("api/v1/customer/{customerId}")
    public Customer getCustomer(
            @PathVariable("customerId") Integer customerId) {
        return customerService.getCustomer(customerId) ;

//        Customer customer = customers.stream().filter(c -> c.id.equals(customerId)).findFirst().orElseThrow(
//                () -> new IllegalArgumentException("customer with id [%s] not found".formatted(customerId))
//        );
//        return customer;
    }

}
