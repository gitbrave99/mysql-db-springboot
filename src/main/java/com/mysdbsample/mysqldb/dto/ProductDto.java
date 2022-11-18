package com.mysdbsample.mysqldb.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto implements Serializable {
    // String getProductCode();
    // String getProductName();
    // String getBuyPrice();
    // String getQuantityInStock();

    private String productCode;
    private String productName;
    private String buyPrice;
    private String quantityInStock;

}
