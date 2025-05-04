package com.learntest.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learntest.demo.DTO.CategoryDTO;
import com.learntest.demo.entity.Category;
import com.learntest.demo.mapper.CategoryMapper;
import com.learntest.demo.mapper.ProductMapper;
import com.learntest.demo.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository ctrg;

    // create Category
    public CategoryDTO createCategory(CategoryDTO category) {
        Category ctg = CategoryMapper.toCategoryEntity(category);
        ctg = ctrg.save(ctg);
        CategoryDTO ctdo = CategoryMapper.toCategoryDTO(ctg);
        return ctdo;
    }

    public List<CategoryDTO> getAllCategories() {
        return StreamSupport.stream(ctrg.findAll().spliterator(), false)
                .map(CategoryMapper::toCategoryDTO)
                .collect(Collectors.toList());
    }

    public CategoryDTO getCategoryById(Long id) {
        Category category = ctrg.findById(id).orElseThrow(() -> new RuntimeException("Category Exception"));
        return CategoryMapper.toCategoryDTO(category);
    }

    public String deleteCategory(Long id) {
        ctrg.deleteById(id);
        return "Category " + id + " has been deleted!";
    }

}
