package com.mysdbsample.mysqldb.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysdbsample.mysqldb.entity.Employee;
import com.mysdbsample.mysqldb.repository.EmployeeRepository;
import com.mysdbsample.mysqldb.service.EmployeeService;

@Service
public class EmployeeImplement implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEmployee(Employee emp) {
        employeeRepository.save(emp);
    }
    
}
