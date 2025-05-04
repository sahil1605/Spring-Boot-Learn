package com.learntest.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    //createcategory
    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO ctdo){
        return new ResponseEntity<>(ctse.createCategory(ctdo),HttpStatus.CREATED);
        
    }
    //putclass

    
}
