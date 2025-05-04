package com.learntest.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String name;
    private long quantity;
    private String comments;
    private long price;

    @ManyToOne
    @JoinColumn(name = "category_id" , nullable = false)
    private Category category;

}