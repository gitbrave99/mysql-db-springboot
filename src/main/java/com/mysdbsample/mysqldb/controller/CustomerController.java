package com.mysdbsample.mysqldb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysdbsample.mysqldb.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<?> getAll() {
        if (customerService.getAll().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay datos");
        }
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getAll());
    }

    @GetMapping("/dto")
    public ResponseEntity<?> getAllDTO() {
        if (customerService.getAllDto().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay datos");
        }
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getAllDto());
    }

}
