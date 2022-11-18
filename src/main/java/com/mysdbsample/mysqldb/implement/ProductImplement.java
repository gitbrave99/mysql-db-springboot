package com.mysdbsample.mysqldb.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysdbsample.mysqldb.dto.ProductDto;
import com.mysdbsample.mysqldb.dto.Productdtoc;
import com.mysdbsample.mysqldb.entity.Product;
import com.mysdbsample.mysqldb.repository.ProductRepository;
import com.mysdbsample.mysqldb.service.ProductService;

@Service
public class ProductImplement implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    @Override
    public ArrayList<Product> getAll() {
        return (ArrayList<Product>) productRepository.findAll();
    }

    @Transactional
    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAllOrderByProductCodeDesc() {
        return productRepository.findAllByOrderByProductCodeDesc();
    }

    @Override
    public List<ProductDto> getAllProductsDto() {
        return productRepository.findAllProductsDto();
    }

    @Override
    public List<Product> getAllProductsWithJPQL() {
        return productRepository.getAllProductsJPQL();
    }



    
}
