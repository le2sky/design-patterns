package org.pattern;

import org.pattern.behavioral.observer.ObserverTest;
import org.pattern.common.Testable;
public class Main {
    public static void main(String[] args) {
        Testable test = new ObserverTest();
        test.run();
    }
}