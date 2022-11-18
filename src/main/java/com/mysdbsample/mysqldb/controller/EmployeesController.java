package com.mysdbsample.mysqldb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysdbsample.mysqldb.entity.Employee;
import com.mysdbsample.mysqldb.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<?> getAll() {
        if (this.employeeService.getAllEmployees().isEmpty()) {
            ResponseEntity.status(HttpStatus.NO_CONTENT).body("NO hay datos");
        }
        return ResponseEntity.status(HttpStatus.OK).body(this.employeeService.getAllEmployees());
    }

    // @PostMapping("/save")
    // public ResponseEntity<?> saveEmployee(@Valid @RequestBody Employee employee, BindingResult result){
            
    // }

}
