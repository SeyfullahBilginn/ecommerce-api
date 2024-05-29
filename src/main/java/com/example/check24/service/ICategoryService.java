package com.example.check24.service;

import com.example.check24.model.Category;

import java.util.List;

public interface ICategoryService {
    public List<Category> getAllCategories();

    public Category addCategory(Category category);
}
