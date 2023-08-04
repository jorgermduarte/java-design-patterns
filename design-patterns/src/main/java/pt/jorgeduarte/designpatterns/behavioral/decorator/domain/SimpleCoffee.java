package pt.jorgeduarte.designpatterns.behavioral.decorator.domain;

public class SimpleCoffee implements ICoffee
{
    public String GetDescription()
    {
        return "Coffee";
    }

    public double GetCost()
    {
        return 1.0;
    }
}