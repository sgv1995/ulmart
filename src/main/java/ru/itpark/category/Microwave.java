package ru.itpark.category;

public class Microwave extends Product{
    private int microwavePower;

    public Microwave(int id, String category, String name, String description, int price, int rating, String colour, String imageUrl, boolean available, int microwavePower) {
        super(id, category, name, description, price, rating, colour, imageUrl, available);
        this.microwavePower = microwavePower;
    }


}
