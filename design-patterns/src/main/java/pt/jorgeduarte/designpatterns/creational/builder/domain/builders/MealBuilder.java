package pt.jorgeduarte.designpatterns.creational.builder.domain.builders;

import pt.jorgeduarte.designpatterns.builder.domain.entities.*;
import pt.jorgeduarte.designpatterns.creational.builder.domain.entities.*;

public class MealBuilder {
    Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
