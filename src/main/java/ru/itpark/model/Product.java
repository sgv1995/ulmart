package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private int id;
    private String category;
    private String name;
    private String description;
    private int price;
    private int rating;
    private String colour;
    private String imageUrl;
    private boolean available;
}