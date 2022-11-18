package com.mysdbsample.mysqldb.entity;

import java.io.Serializable;

public class OrderDetails implements Serializable {

    private Long orderNumber;
    private String productCode;
    private Integer quantityOrdered;
    private double priceEach;
    private Integer orderLineNumber;
}
