package com.example.ecommerce_second.models;

import javax.persistence.*;
import java.util.List;

@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long categoryName;

    private Category parentCategory;

    private List<Category> categories;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
}