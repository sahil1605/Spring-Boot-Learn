package com.learntest.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learntest.demo.entity.Category;
// implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
//     implementation 'org.postgresql:postgresql'

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByName(String categoryName);
    void deleteByName(String categoryName);
}