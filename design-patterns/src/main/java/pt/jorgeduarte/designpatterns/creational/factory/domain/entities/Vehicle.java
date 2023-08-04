package pt.jorgeduarte.designpatterns.creational.factory.domain.entities;

public class Vehicle {

    private String name;

    Vehicle(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

}
