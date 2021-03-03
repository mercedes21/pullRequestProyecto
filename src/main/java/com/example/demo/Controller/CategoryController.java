package com.example.demo.Controller;


import com.example.demo.CategoryDTO.CategoryDto;
import com.example.demo.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/category")
    public ResponseEntity saveCategory(@RequestBody CategoryDto categoryDto){
        categoryService.saveCategory(categoryDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}




