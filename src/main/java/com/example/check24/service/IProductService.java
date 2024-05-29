package com.example.check24.service;

import com.example.check24.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findProducts(Optional<String> productName, Optional<Double> minPrice, Optional<Double> maxPrice);
    List<Product> findAllProducts();
    void addProduct(Product product);

}
