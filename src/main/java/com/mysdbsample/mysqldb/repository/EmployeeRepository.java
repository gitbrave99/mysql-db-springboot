package com.mysdbsample.mysqldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysdbsample.mysqldb.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
