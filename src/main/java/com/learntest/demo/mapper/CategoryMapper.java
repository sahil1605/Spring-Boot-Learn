package com.learntest.demo.mapper;
import java.util.List;
import com.learntest.demo.DTO.CategoryDTO;
import com.learntest.demo.entity.Category;
import com.learntest.demo.entity.Product;

public class CategoryMapper {
    public static CategoryDTO toCategoryDTO(Category ctg){
        if(ctg == null)return null;

        CategoryDTO ctdo = new CategoryDTO();
        ctdo.setId(ctg.getId());
        ctdo.setName(ctg.getName());
        ctdo.setProducts(ctg.getPrds().stream().map(ProductMapper::toProductDTO).toList());
        return ctdo;
    }
    public static Category toCategoryEntity(CategoryDTO ctd){{
        Category ctg = new Category();
        ctg.setName(ctd.getName());
        return ctg; 

    }}
}
