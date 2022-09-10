package org.pattern.behavioral.observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("graphObserver");
        int number = generator.getNumber();

        for(int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
