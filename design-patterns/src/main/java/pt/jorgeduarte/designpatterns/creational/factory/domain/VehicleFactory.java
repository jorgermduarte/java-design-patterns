package pt.jorgeduarte.designpatterns.creational.factory.domain;

import pt.jorgeduarte.designpatterns.creational.factory.domain.entities.Vehicle;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}
