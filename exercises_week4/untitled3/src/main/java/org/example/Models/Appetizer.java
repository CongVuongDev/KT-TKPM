package org.example.Models;

import org.example.Decorator.DishDecorator;

public class Appetizer extends DishDecorator {
    public Appetizer(Dish decoratedDish){
        super(decoratedDish);
    }

    @Override
    public String getDescription(){
        return super.getDescription()+ " + Món khai vị";
    }
    @Override
    public double getCost(){
        return super.getCost() + 40000;
    }

}
