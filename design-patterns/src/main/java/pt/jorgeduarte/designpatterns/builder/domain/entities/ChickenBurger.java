package pt.jorgeduarte.designpatterns.builder.domain.entities;

public class ChickenBurger implements IItem {
    public String name() {
        return "Chicken Burger";
    }

    public float price() {
        return 3.5f;
    }
}