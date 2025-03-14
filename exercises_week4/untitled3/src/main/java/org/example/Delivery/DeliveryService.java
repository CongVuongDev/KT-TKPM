package org.example.Delivery;

import org.example.Decorator.DishDecorator;
import org.example.Models.Dish;

public class DeliveryService extends DishDecorator {
    public DeliveryService(Dish decoratedDish){
        super(decoratedDish);
    }

    @Override
    public String getDescription(){
        return super.getDescription()+ " + Giao hàng";
    }
    @Override
    public double getCost(){
        return super.getCost() + 50000;
    }

}
