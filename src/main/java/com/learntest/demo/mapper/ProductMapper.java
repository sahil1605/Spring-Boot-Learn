package com.learntest.demo.mapper;

import com.learntest.demo.DTO.ProductDTO;
import com.learntest.demo.entity.Product;
import com.learntest.demo.entity.Category;

public class ProductMapper {
    public static ProductDTO toProductDTO(Product ctg){
        if(ctg == null)return null;
        
        return new ProductDTO(
            ctg.getId(),
            ctg.getName(),
            ctg.getComments(),
             ctg.getPrice(),
             ctg.getCategory().getId()
        );

    }
    public static Product toProductEntity(ProductDTO pdto,Category ctgy){
        return new Product(pdto.getId(),pdto.getName(),4,pdto.getDescription(),pdto.getPrice(),ctgy);
    }
}
