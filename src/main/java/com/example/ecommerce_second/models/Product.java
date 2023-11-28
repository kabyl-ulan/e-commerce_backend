package com.example.ecommerce_second.models;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "products")
public class Product {

    @Id
    private long id;

    private double price;

    private int amount;

    private String productName;

    private String description;

    private LocalDate receiptDate;

}
