package org.pattern.creational.factoryMethod;

import org.pattern.common.Testable;

public class FactoryMethodTest implements Testable {

    @Override
    public void run() {
        CarFactory factory = new HyundaiCarFactory();
        Car car = factory.createCar("sonata");
        System.out.println(car);

        Car myCar =  factory.returnCar("Tomas");
        Car hisCar = factory.returnCar("Tomas");

        System.out.println(myCar == hisCar);
    }
}
