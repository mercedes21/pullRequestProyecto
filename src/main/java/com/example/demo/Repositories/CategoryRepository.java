package com.example.demo.Repositories;

import com.example.demo.Entityes.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
