package com.mysdbsample.mysqldb.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeNumber;
    
    
    private String lastName;
    
    
    private String firstName;
    
    
    private String extension;
    
    
    private String email;
    
    
    private String officeCode;
    
    
    private Integer reportsTo;
    
    
    private String jobTitle;
}


