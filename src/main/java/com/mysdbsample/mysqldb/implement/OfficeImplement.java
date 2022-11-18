package com.mysdbsample.mysqldb.implement;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysdbsample.mysqldb.entity.Office;
import com.mysdbsample.mysqldb.repository.OfficeRepository;
import com.mysdbsample.mysqldb.service.OfficeService;

@Service
public class OfficeImplement implements OfficeService {

    @Autowired
    OfficeRepository officeRepository;

    @Transactional(readOnly = true)
    @Override
    public ArrayList<Office> getList() {
        return (ArrayList<Office>) officeRepository.findAll();
    }

    @Transactional
    @Override
    public void save(Office office) {
        officeRepository.save(office);
    }

    @Transactional(readOnly = true)
    @Override
    public Office finfById(String id) {

        return officeRepository.findById(id).orElse(null);
    }

    @Override
    public Office update(Office office) {
        return officeRepository.save(office);
    }

}
