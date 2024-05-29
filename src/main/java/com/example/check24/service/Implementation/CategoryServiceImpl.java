package com.example.check24.service.Implementation;
import com.example.check24.model.Category;
import com.example.check24.repository.CategoryRepository;
import com.example.check24.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    public CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addCategory(Category category) {
        System.out.println(category.toString());
        return categoryRepository.save(category);
    }
}
