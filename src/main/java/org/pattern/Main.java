package org.pattern;

import org.pattern.behavioral.visitor.VisitorTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new VisitorTest();
        test.run();
    }
}