package com.learntest.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learntest.demo.entity.Category;
@Repository
public interface ProductRepository extends JpaRepository<Category, Long>{
    
}
