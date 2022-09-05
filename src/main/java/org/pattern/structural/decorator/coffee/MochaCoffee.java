package org.pattern.structural.decorator.coffee;

public class MochaCoffee extends Decorator{
    public MochaCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("adding mocha syrup");
    }
}
