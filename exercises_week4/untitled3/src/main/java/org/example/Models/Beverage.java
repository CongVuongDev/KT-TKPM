package org.example.Models;

import org.example.Decorator.DishDecorator;

public class Beverage extends DishDecorator {
    public Beverage(Dish decoratedDish){
        super(decoratedDish);
    }

    @Override
    public String getDescription(){
        return super.getDescription()+ " + Nước uống";
    }
    @Override
    public double getCost(){
        return super.getCost() + 20000;
    }

}


