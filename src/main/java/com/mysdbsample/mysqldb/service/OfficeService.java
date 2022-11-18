package com.mysdbsample.mysqldb.service;

import java.util.ArrayList;

import com.mysdbsample.mysqldb.entity.Office;

public interface OfficeService {
    
    ArrayList<Office> getList();
    public void save(Office office);
    public Office finfById(String id);
    public Office update(Office office);

    
}
