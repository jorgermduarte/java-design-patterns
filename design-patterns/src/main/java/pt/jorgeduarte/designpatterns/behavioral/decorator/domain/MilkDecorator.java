package pt.jorgeduarte.designpatterns.behavioral.decorator.domain;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String GetDescription()
    {
        return this.GetDescription() + ", Milk";
    }

    @Override
    public  double GetCost()
    {
        return this.GetCost() + 0.5;
    }
}