package org.pattern;

import org.pattern.behavioral.chainOfReponsibility.ChainOfResponsibilityTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new ChainOfResponsibilityTest();
        test.run();
    }
}