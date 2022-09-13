package org.pattern;

import org.pattern.behavioral.iterator.IteratorTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new IteratorTest();
        test.run();
    }
}