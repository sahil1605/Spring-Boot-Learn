package com.learntest.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO{
    private long id;
    private String name;
    private String description;
    private long price;
    private long categoryId;
}