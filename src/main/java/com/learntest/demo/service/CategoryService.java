package com.learntest.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learntest.demo.DTO.CategoryDTO;
import com.learntest.demo.entity.Category;
import com.learntest.demo.mapper.CategoryMapper;
import com.learntest.demo.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository ctrg;
    //create Category
    public CategoryDTO createCategory(CategoryDTO category){
        Category ctg = CategoryMapper.toCategoryEntity(category);
        ctg = ctrg.save(ctg);
        CategoryDTO ctdo = CategoryMapper.toCategoryDTO(ctg);
        return ctdo;
    }


    //GetCategory

    //DeleteCategory

    
}
