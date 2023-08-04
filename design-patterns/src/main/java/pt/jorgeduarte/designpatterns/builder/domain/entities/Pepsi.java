package pt.jorgeduarte.designpatterns.builder.domain.entities;

public class Pepsi implements IItem {
    public String name() {
        return "Pepsi";
    }

    public float price() {
        return 1.0f;
    }
}
