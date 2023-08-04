package pt.jorgeduarte.designpatterns.creational.abstractfactory.domain;

import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.dark.DarkButton;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.dark.DarkScrollBar;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.Button;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.GUIFactory;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.ScrollBar;

public class DarkThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new DarkScrollBar();
    }
}

