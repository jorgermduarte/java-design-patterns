package pt.jorgeduarte.designpatterns.behavioral.decorator.domain;

public abstract class CoffeeDecorator implements ICoffee
{
    protected ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee coffee)
    {
        this.decoratedCoffee = coffee;
    }

    public String GetDescription()
    {
        return decoratedCoffee.GetDescription();
    }

    public double GetCost()
    {
        return decoratedCoffee.GetCost();
    }
}
