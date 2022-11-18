package com.mysdbsample.mysqldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysdbsample.mysqldb.entity.ProductLine;
@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine,String>{
    
}
