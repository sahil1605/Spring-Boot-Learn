package com.learntest.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learntest.demo.entity.Category;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {}