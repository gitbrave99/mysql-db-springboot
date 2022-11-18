package com.mysdbsample.mysqldb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysdbsample.mysqldb.service.ProductLineService;

@RestController
@RequestMapping("/productlines")
public class ProductLineController {

    @Autowired
    ProductLineService productLineService;

    @GetMapping("/")
    public ResponseEntity<?> getAll() {
        if (productLineService.getAll().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay datos");
        }
        return ResponseEntity.status(HttpStatus.OK).body(productLineService.getAll());
    }

}
