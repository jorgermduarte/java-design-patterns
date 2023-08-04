package pt.jorgeduarte.designpatterns.builder.domain.entities;

public class Coke implements IItem {
    public String name() {
        return "Coke";
    }

    public float price() {
        return 1.0f;
    }
}

