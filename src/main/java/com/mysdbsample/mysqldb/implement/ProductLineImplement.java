package com.mysdbsample.mysqldb.implement;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mysdbsample.mysqldb.entity.ProductLine;
import com.mysdbsample.mysqldb.repository.ProductLineRepository;
import com.mysdbsample.mysqldb.service.ProductLineService;

@Service
public class ProductLineImplement implements ProductLineService {

    @Autowired
    ProductLineRepository productLineRepository;

    @Override
    public ArrayList<ProductLine> getAll() {
        return (ArrayList<ProductLine>) productLineRepository.findAll();
    }

    @Override
    public ProductLine getProductLine(String id) {
        return productLineRepository.findById(id).orElse(null);
    }

}
