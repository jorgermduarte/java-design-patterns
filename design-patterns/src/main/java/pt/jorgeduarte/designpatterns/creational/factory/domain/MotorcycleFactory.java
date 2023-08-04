package pt.jorgeduarte.designpatterns.creational.factory.domain;

import pt.jorgeduarte.designpatterns.creational.factory.domain.entities.Vehicle;
import pt.jorgeduarte.designpatterns.creational.factory.domain.entities.Motorcycle;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle("Kawasaki Ninja 1000");
    }
}