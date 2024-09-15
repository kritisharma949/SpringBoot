package com.kritiscode.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao {
    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer kriti = new Customer(
                1,
                "Kriti",
                "kriti@gmail.com",
                25

        );
        customers.add(kriti);

        Customer priti = new Customer(
                2,
                "Priti",
                "Priti@gmail.com",
                27

        );
        customers.add(priti);
    }

    @Override
    public List<Customer> selectAllCustomers(){
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return  customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }
}
