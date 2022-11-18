package com.mysdbsample.mysqldb.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysdbsample.mysqldb.dto.CustomerDTO;
import com.mysdbsample.mysqldb.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT customerNumber,customerName FROM customers", nativeQuery = true)
    public ArrayList<CustomerDTO> findAllCustomers();

}
