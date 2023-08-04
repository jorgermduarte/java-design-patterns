package pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.white;

import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.Button;

public class WhiteButton implements Button {
    @Override
    public void render() {
        System.out.println("Render de um botão White...");
    }
}