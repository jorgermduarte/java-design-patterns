package pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.dark;

import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Render de um botão Dark...");
    }
}
