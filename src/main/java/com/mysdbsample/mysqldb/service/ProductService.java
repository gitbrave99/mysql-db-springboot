package com.mysdbsample.mysqldb.service;

import java.util.ArrayList;
import java.util.List;

import com.mysdbsample.mysqldb.dto.ProductDto;
import com.mysdbsample.mysqldb.dto.Productdtoc;
import com.mysdbsample.mysqldb.entity.Product;

public interface ProductService {

    public ArrayList<Product> getAll();
    public Product getProduct(String id);
    public List<Product> getAllOrderByProductCodeDesc();
    public List<ProductDto> getAllProductsDto();
    public List<Product> getAllProductsWithJPQL();

}
