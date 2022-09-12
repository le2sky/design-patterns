package org.pattern;

import org.pattern.behavioral.mediator.MediatorTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new MediatorTest();
        test.run();
    }
}