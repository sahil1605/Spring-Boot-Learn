package com.learntest.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learntest.demo.DTO.ProductDTO;
import com.learntest.demo.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    //getproduct
    //createProduct
    @Autowired
    private ProductService pds;

    @GetMapping
    public List<ProductDTO> getAllProduct() {
        return pds.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO prdo){
        return new ResponseEntity<>(pds.saveProduct(prdo),HttpStatus.CREATED);
    }
}
