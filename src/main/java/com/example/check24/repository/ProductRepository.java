package com.example.check24.repository;

import com.example.check24.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductNameContainingIgnoreCase(String productName);
    List<Product> findByProductNameContainingIgnoreCaseAndPriceGreaterThan(String productName, double price);
    List<Product> findByProductNameContainingIgnoreCaseAndPriceLessThan(String productName, double price);
    List<Product> findByProductNameContainingIgnoreCaseAndPriceBetween(String productName, double minPrice, double maxPrice);
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByPriceLessThan(double price);
    List<Product> findByPriceBetween(double minPrice, double maxPrice);
}
