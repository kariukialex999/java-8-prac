package org.kariioke.streamsLambdas;

public class Product {
    private String name;
    private String category;
    private double price;
    private double rating;

    Product(String name, String category, double price, double rating) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public double getRating() {
        return rating;
    }
}
