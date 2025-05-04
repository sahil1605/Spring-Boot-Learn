package com.learntest.demo.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private long id;
    private String name;
    private List<ProductDTO> products;   
}
