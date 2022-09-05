package org.pattern;

import org.pattern.common.Testable;
import org.pattern.structural.decorator.DecoratorTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new DecoratorTest();
        test.run();
    }
}