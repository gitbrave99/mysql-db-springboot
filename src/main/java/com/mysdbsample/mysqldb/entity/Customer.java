package com.mysdbsample.mysqldb.entity;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer implements Serializable{
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long customerNumber;

  @Column(name = "customerName")
  private String customerName;

  @Column(name = "contactLastName")
  private String contactLastName;
  
  @Column(name = "contactFirstName")
  private String contactFirstName;
  
  @Column(name = "phone")
  private String phone;
  
  @Column(name = "addressLine1")
  private String addressLine1;
  
  @Column(name = "addressLine2")
  private String addressLine2;
  
  @Column(name="city")
  private String city;
  
  @Column(name="state")
  private String state;
  
  @Column(name="postalCode")
  private String postalCode;
  
  @Column(name="country")
  private String country;
  
  @Column(name="salesRepEmployeeNumber")
  private Integer salesRepEmployeeNumber;
  
  @Column(name = "creditLimit")
  private double creditLimit;
}
