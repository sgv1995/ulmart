package ru.itpark.category;

public class AccumulatorBattery extends Product {

    private int capacity;
    private int startingCurrent;
    private String polarity;

    public AccumulatorBattery(int id, String category, String name, String description, int price, int rating, String colour, String imageUrl, boolean available, int capacity, int startingCurrent, String polarity) {
        super(id, category, name, description, price, rating, colour, imageUrl, available);
        this.capacity = capacity;
        this.startingCurrent = startingCurrent;
        this.polarity = polarity;
    }

}
