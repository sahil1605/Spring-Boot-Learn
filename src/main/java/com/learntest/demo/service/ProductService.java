package com.learntest.demo.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.learntest.demo.DTO.ProductDTO;
import com.learntest.demo.entity.Category;
import com.learntest.demo.entity.Product;
import com.learntest.demo.mapper.ProductMapper;
import com.learntest.demo.repository.CategoryRepository;
import com.learntest.demo.repository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ProductService {
    @Autowired
    private CategoryRepository ctsp;
    @Autowired
    private ProductRepository prc;

     // Get All Products
     public List<ProductDTO> getAllProducts(){
        // return prc.findAll().stream().map(ProductMapper::toProductDTO).toList();
        return StreamSupport.stream(prc.findAll().spliterator(), false)
                .map(ProductMapper::toProductDTO)
                .toList();
    }

    // Get Product by id
    public ProductDTO getProductById(Long id){
        Product product = prc.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found!"));
        return ProductMapper.toProductDTO(product);
    }
    //Create Category
    public ProductDTO saveProduct(ProductDTO prdto){
        Category ctg = ctsp.findById(prdto.getCategoryId())
        .orElseThrow(()->new RuntimeException("Category Exception"));
        Product prd = ProductMapper.toProductEntity(prdto,ctg);
        prd = prc.save(prd);
        return ProductMapper.toProductDTO(prd);
    }
}
