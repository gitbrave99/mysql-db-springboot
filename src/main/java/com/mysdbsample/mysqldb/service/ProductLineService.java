package com.mysdbsample.mysqldb.service;

import java.util.ArrayList;

import com.mysdbsample.mysqldb.entity.ProductLine;

public interface ProductLineService {
    
    public ArrayList<ProductLine> getAll();

    public ProductLine getProductLine(String id);

    
}
