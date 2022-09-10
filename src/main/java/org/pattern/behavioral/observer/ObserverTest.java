package org.pattern.behavioral.observer;

import org.pattern.common.Testable;

public class ObserverTest implements Testable {
    @Override
    public void run() {
        NumberGenerator numberGenerator = new RamdomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);

        numberGenerator.execute();
    }
}
