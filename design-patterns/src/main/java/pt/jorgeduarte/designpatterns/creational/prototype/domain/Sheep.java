package pt.jorgeduarte.designpatterns.creational.prototype.domain;

public class Sheep implements Cloneable {
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    protected Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}