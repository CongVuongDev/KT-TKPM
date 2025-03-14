package org.example.Models;

public class BasicDish implements Dish {

    @Override
    public String getDescription() {
        return "Món chính";
    }

    @Override
    public double getCost() {
        return 100000;
    }
}
