package com.mysdbsample.mysqldb.service;

import java.util.ArrayList;

import com.mysdbsample.mysqldb.dto.CustomerDTO;
import com.mysdbsample.mysqldb.entity.Customer;

public interface CustomerService {
    
    public ArrayList<Customer> getAll();
    
    
    public Customer getCustomer(Long id);
    
    public ArrayList<CustomerDTO> getAllDto();
    
}
