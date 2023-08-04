package pt.jorgeduarte.designpatterns.creational.abstractfactory.domain;

import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.Button;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.GUIFactory;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.interfaces.ScrollBar;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.white.WhiteButton;
import pt.jorgeduarte.designpatterns.creational.abstractfactory.domain.white.WhiteScrollBar;

public class WhiteThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WhiteButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WhiteScrollBar();
    }
}
