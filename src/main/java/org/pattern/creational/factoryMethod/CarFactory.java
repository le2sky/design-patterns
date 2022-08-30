package org.pattern.creational.factoryMethod;

public abstract class CarFactory {

    public abstract Car createCar(String name);

    public abstract Car returnCar(String name);

    public void numbering() {
        System.out.println("numbering");
    }

    public void washCar() {
        System.out.println("washCar");
    }

    // 템플릿 메서드
    final public void sellCar(String name) {
        numbering();
        createCar(name);
        washCar();
    }


}
