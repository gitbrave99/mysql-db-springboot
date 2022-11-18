package com.mysdbsample.mysqldb.entity;

import java.time.LocalDate;

public class Order {
    private Long orderNumber;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate shippedDate;
    private String status;
    private String comments;
    private Integer customerNumber;
}
