package pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces;

public interface GUIFactory {
    Button createButton();
    ScrollBar createScrollBar();
}
