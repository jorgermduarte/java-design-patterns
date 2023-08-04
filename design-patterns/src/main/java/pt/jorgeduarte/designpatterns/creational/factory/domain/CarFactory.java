package pt.jorgeduarte.designpatterns.creational.factory.domain;

import pt.jorgeduarte.designpatterns.creational.factory.domain.entities.Car;
import pt.jorgeduarte.designpatterns.creational.factory.domain.entities.Vehicle;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car("Supra MK4 97");
    }
}
