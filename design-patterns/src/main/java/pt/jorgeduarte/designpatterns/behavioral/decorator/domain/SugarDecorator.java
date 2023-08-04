package pt.jorgeduarte.designpatterns.behavioral.decorator.domain;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String GetDescription() {
        return decoratedCoffee.GetDescription() + ", with sugar";
    }

    @Override
    public double GetCost() {
        return decoratedCoffee.GetCost() + 0.2;
    }
}