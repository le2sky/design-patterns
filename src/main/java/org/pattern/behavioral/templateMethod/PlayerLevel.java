package org.pattern.behavioral.templateMethod;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    //hook method : 부가적인 기능을 추가할 수 있다. 하지만 반드시는 아니다. 반드시 해야하는 동작이라면 abstract로 선언해야한다.
    public void fly() {}

    final public void go(int count) {
        run();
        for(int i = 0; i < count; i++) {
            jump();
        }
        turn();

        fly();
    }


}
