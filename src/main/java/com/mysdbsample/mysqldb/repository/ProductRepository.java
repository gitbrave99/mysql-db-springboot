package com.mysdbsample.mysqldb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mysdbsample.mysqldb.dto.ProductDto;
import com.mysdbsample.mysqldb.dto.Productdtoc;
import com.mysdbsample.mysqldb.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    @Query(value = "SELECT productCode, productName, buyPrice, quantityInStock FROM products", nativeQuery = true)
    public List<ProductDto> findAllProductsDto();

    public List<Product> findAllByOrderByProductCodeDesc();

    public List<Product> findAllByOrderByProductCodeAsc();

    // JPQL
    // @Query("SELECT p FROM Product p order by productCode desc") // WORKS
    @Query("SELECT p FROM Product p ORDER BY p.productCode DESC")
    public List<Product> getAllProductsJPQL();


}
