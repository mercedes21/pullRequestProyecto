package com.example.demo.Services;

import com.example.demo.CategoryDTO.CategoryDto;
import com.example.demo.Entityes.Category;
import com.example.demo.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
    public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void saveCategory(CategoryDto categoryDto) {
        Category category= new Category();
        category.setDescripcion(categoryDto.getDescripcion());
        category.setState(categoryDto.getState());
        categoryRepository.save(category);
    }

   @Override
    public Optional<Category> searchId(Integer id){
        return categoryRepository.findById(id);
    }

    @Override
    public CategoryDto findById(Integer id){
    return null;
    }
}
