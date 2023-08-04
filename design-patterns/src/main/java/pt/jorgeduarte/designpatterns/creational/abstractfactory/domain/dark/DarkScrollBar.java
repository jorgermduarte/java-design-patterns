package pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.dark;

import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.ScrollBar;

public class DarkScrollBar implements ScrollBar {
    @Override
    public void render() {
        System.out.println("Render de uma scrollbar Dark...");
    }
}