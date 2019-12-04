package ru.itpark.model;

public class Smartphone extends Product {
    private int memory;
    private String system;

    public Smartphone(int id, String category, String name, String description, int price, int rating, String colour, String imageUrl, boolean available, int memory, String system) {
        super(id, category, name, description, price, rating, colour, imageUrl, available);
        this.memory = memory;
        this.system = system;
    }
}
