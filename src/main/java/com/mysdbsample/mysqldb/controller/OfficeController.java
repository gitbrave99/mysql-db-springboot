package com.mysdbsample.mysqldb.controller;

import javax.validation.Valid;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysdbsample.mysqldb.entity.Office;
import com.mysdbsample.mysqldb.service.OfficeService;


@RestController
@RequestMapping("/offices")
public class OfficeController {
    @Autowired
    OfficeService officeService;
    
    @GetMapping("/")
    public ResponseEntity<?> getListOffices(){
        if (officeService.getList().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No offices");
        }
    return ResponseEntity.status(HttpStatus.OK).body(officeService.getList());
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveOffice(@Valid @RequestBody Office office, BindingResult result){

        if(result.hasErrors()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("campos requeridos"+result.getFieldError().getField()+" "+result.getFieldError().getDefaultMessage());
        }

        try {
            if(officeService.finfById(office.getOfficeCode())!=null){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("officina ya esta creada");
            }else{
                officeService.save(office);
                return ResponseEntity.status(HttpStatus.OK).body("Oficina creada");
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "ERROR CREAR OFICINA",e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Json inválido");
    }

}
