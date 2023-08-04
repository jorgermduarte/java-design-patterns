package pt.jorgeduarte.designpatterns.builder.domain.entities;

public class VegBurger implements IItem {
    public String name() {
        return "Veg Burger";
    }

    public float price() {
        return 2.5f;
    }
}
