package com.pluralsight;

public class Main {

    private String purpose;
    private String model;
    private String color;
    private double price;
    private String year;

    public static void main(String[] args) {
        class car {
            public car(String s, String black, int i) {
            }

            car c1 = new car("Mitsubishi Eclipse", "Black", 16000);
            car c2 = new car("Dodge Viper", "Black", 60000);
            car c3 = new car("Nissan 350z", "Black", 30000);
        }
    }

    public void carInfo() {
        System.out.printf("Model: " + this.model + "\n" +
                "Type: " + this.model + "\n" +
                "Year: " + this.year + "\n" +
                "Color: " + this.color + "\n" +
                "Weight: " + this.purpose + "\n" +
                "Price: $%.2f", this.price);

        {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
        }
    }
}