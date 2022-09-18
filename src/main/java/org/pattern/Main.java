package org.pattern;

import org.pattern.common.Testable;
import org.pattern.structural.flyweight.FlyweightTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new FlyweightTest();
        test.run();
    }
}