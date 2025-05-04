package com.learntest.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learntest.demo.DTO.CategoryDTO;
import com.learntest.demo.service.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/categories")
@AllArgsConstructor
public class CategoryController {
    @Autowired
    CategoryService ctse;
    //getcategory
      @GetMapping
    public List<CategoryDTO> getAllCategories(){
        return ctse.getAllCategories();
    }
    //createcategory
    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO ctdo){
        return new ResponseEntity<>(ctse.createCategory(ctdo),HttpStatus.CREATED);
        
    }
    //putclass

     @GetMapping("/{id}")
    public CategoryDTO getCategoryById(@PathVariable Long id){
        return ctse.getCategoryById(id);
    }

     @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id){
        return ctse.deleteCategory(id);
    }

    
}
