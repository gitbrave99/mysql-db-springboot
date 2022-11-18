package com.mysdbsample.mysqldb.implement;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysdbsample.mysqldb.dto.CustomerDTO;
import com.mysdbsample.mysqldb.entity.Customer;
import com.mysdbsample.mysqldb.repository.CustomerRepository;
import com.mysdbsample.mysqldb.service.CustomerService;

@Service
public class CustomerImplement implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional(readOnly = true)
    @Override
    public ArrayList<Customer> getAll() {
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public ArrayList<CustomerDTO> getAllDto() {
        return (ArrayList<CustomerDTO>) customerRepository.findAllCustomers();
    }

}
