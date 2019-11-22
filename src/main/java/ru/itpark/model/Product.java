package ru.itpark.model;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Product implements Comparator<Product> {
    private int id;
    private String name;
    private String description;
    private int Price;
    private int rating;
    private String colour;
    private String imageUrl;
    private boolean available;

    public Product(int id, String name, String description, int price, int rating, String colour, String imageUrl, boolean available) {
        this.id = id;
        this.name = name;
        this.description = description;
        Price = price;
        this.rating = rating;
        this.colour = colour;
        this.imageUrl = imageUrl;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", Price=" + Price +
                ", rating=" + rating +
                ", colour='" + colour + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", available=" + available +
                '}';
    }



    @Override
    public int compare(Product o) {
        return name - o.name;
    }

}