package pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.white;

import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.ScrollBar;

public class WhiteScrollBar implements ScrollBar {
    @Override
    public void render() {
        System.out.println("Render de uma scrollbar White...");
    }
}