package com.example.demo.Services;


import com.example.demo.CategoryDTO.CategoryDto;
import com.example.demo.Entityes.Category;

import java.util.Optional;

public interface CategoryService {
    void saveCategory(CategoryDto categoryDto);
        CategoryDto findById(Integer id);
        Optional<Category> searchId(Integer id);
}



