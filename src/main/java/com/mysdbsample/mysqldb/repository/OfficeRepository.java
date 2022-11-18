package com.mysdbsample.mysqldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysdbsample.mysqldb.entity.Office;
@Repository
public interface OfficeRepository extends JpaRepository<Office,String>{
    
}
