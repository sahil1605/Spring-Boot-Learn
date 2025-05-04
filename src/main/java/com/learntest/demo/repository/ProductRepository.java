package com.learntest.demo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learntest.demo.entity.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
