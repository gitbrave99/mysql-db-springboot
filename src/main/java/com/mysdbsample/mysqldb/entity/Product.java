package com.mysdbsample.mysqldb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product implements Serializable {

  @Id
  @Column(name = "productCode")
  private String productCode;

  @Column(name = "productName")
  private String productName;

  @Column(name = "productLine")
  private String productLine;

  @Column(name = "productScale")
  private String productScale;

  @Column(name = "productVendor")
  private String productVendor;

  @Column(name = "productDescription")
  private String productDescription;

  @Column(name = "quantityInStock")
  private Integer quantityInStock;

  @Column(name = "buyPrice")
  private double buyPrice;

  @Column(name = "MSRP")
  private double MSRP;

}
