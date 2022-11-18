package com.mysdbsample.mysqldb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysdbsample.mysqldb.service.ProductService;

import ch.qos.logback.core.joran.conditional.IfAction;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ResponseEntity<?> getAll() {
        if (productService.getAll().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay productos");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(productService.getAll());
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<?> getProduct(@PathVariable("id") String id) {
        if (productService.getProduct(id) == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No existe");
        }
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProduct(id));
    }

    @GetMapping(value = "orderDesc")
    public ResponseEntity<?> getProductOrderDescById() {
        if (productService.getAllOrderByProductCodeDesc().isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No ha datos");
        }
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAllOrderByProductCodeDesc());
    }

    @GetMapping("/productsdto")
    public ResponseEntity<?> getProductsDto() {
        if (productService.getAllOrderByProductCodeDesc().isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No ha datos");
        }
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProductsDto());
    }

    @GetMapping("/productsjpql")
    public ResponseEntity<?> gerProductsJpqL() {
        if (productService.getAllProductsWithJPQL().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay productos");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(productService.getAllProductsWithJPQL());
    }

   /*
   *  @GetMapping("/productsjpqldto")
    public ResponseEntity<?> gerProductsJpqLdto() {
        if (productService.getAllProductsWithJPQL().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No hay productos");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(productService.getAllProductsDtoJPQL());
    }*/

}
