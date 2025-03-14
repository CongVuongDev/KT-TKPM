package org.example;

import org.example.Delivery.DeliveryService;
import org.example.Models.Appetizer;
import org.example.Models.BasicDish;
import org.example.Models.Beverage;
import org.example.Models.Dish;

public class Main {
    public static void main(String[] args) {
        Dish dish = new BasicDish();
        dish = new Beverage(dish);
        dish = new Appetizer(dish);
        dish = new DeliveryService(dish);

        System.out.println("Mô tả: "+dish.getDescription());
        System.out.println("Tổng giá: "+dish.getCost()+ " VNĐ");
    }
}