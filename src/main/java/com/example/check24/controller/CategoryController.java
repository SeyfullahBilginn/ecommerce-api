package com.example.check24.controller;

import com.example.check24.model.Category;
import com.example.check24.model.Product;
import com.example.check24.service.ICategoryService;
import com.example.check24.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/get_all_categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    };

    @PostMapping("/add_category")
    public Category addCategory(@RequestBody Category category) {
        System.out.println(category.toString());
        return categoryService.addCategory(category);
    }

}
