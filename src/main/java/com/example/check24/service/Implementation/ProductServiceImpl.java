package com.example.check24.service.Implementation;
import com.example.check24.model.Product;
import com.example.check24.repository.ProductRepository;
import com.example.check24.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> findProducts(Optional<String> productName, Optional<Double> minPrice, Optional<Double> maxPrice) {
        System.out.println(productName);
        if (productName.isPresent() && minPrice.isPresent() && maxPrice.isPresent()) {
            return productRepository.findByProductNameContainingIgnoreCaseAndPriceBetween(productName.get(), minPrice.get(), maxPrice.get());
        } else if (productName.isPresent() && minPrice.isPresent()) {
            return productRepository.findByProductNameContainingIgnoreCaseAndPriceGreaterThan(productName.get(), minPrice.get());
        } else if (productName.isPresent() && maxPrice.isPresent()) {
            return productRepository.findByProductNameContainingIgnoreCaseAndPriceLessThan(productName.get(), maxPrice.get());
        } else if (productName.isPresent()) {
            return productRepository.findByProductNameContainingIgnoreCase(productName.get());
        } else if (minPrice.isPresent() && maxPrice.isPresent()) {
            return productRepository.findByPriceBetween(minPrice.get(), maxPrice.get());
        } else if (minPrice.isPresent()) {
            return productRepository.findByPriceGreaterThan(minPrice.get());
        } else if (maxPrice.isPresent()) {
            return productRepository.findByPriceLessThan(maxPrice.get());
        } else {
            return productRepository.findAll();
        }
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
