package com.example.check24.controller;

import com.example.check24.model.Product;
import com.example.check24.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/get_products")
    public List<Product> getProducts(@RequestParam Optional<String> productName,
                                     @RequestParam Optional<Double> minPrice,
                                     @RequestParam Optional<Double> maxPrice) {
        return productService.findProducts(productName, minPrice, maxPrice);

    }

    @PostMapping("/add_product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
}
