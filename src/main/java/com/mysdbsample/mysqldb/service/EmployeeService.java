package com.mysdbsample.mysqldb.service;

import java.util.List;

import com.mysdbsample.mysqldb.entity.Employee;

public interface EmployeeService {
 
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id);
    public void saveEmployee(Employee emp);
    
}   
