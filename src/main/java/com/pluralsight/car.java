package com.pluralsight;

public class car {
    // Field attributes
    private final String model;
    private double weightInPounds;
    private double price;
    private String color;
    private final String purpose;
    private final int year;

    // Constructor
    public car(String model, String color, double price, double weightInPounds, String purpose, int year) {

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (weightInPounds < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }

        this.model = model;
        this.color = color;
        this.price = price;
        this.weightInPounds = weightInPounds;
        this.purpose = purpose;
        this.year = year;
    }
    // Empty constructor
    public car() {
        this.model = "Unknown";
        this.color = "Unknown";
        this.price = 0.0;
        this.weightInPounds = 0.0;
        this.purpose = "Unknown";
        this.year = 0;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    // Setters
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public void setWeightInPounds(double weightInPounds) {
        if (weightInPounds < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weightInPounds = weightInPounds;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Display car information
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", weightInPounds=" + weightInPounds +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", purpose='" + purpose + '\'' +
                ", year=" + year +
                '}';
    }

    public void carInformation() {
        System.out.println(this);
    }
}