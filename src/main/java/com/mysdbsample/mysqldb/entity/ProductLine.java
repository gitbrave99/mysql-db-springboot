package com.mysdbsample.mysqldb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productlines")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductLine {

  @Id
  @Column(name = "productLine")
  private String productLine;

  @Column(name = "textDescription")
  private String textDescription;

  @Column(name = "htmlDescription")
  private String htmlDescription;

  @Column(name = "image")
  private String image;

}
