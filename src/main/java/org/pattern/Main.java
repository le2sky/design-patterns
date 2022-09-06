package org.pattern;

import org.pattern.common.Testable;
import org.pattern.structural.composite.CompositeTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new CompositeTest();
        test.run();
    }
}