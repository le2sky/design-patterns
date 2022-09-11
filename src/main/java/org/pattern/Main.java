package org.pattern;

import org.pattern.behavioral.memento.MementoTest;
import org.pattern.common.Testable;
public class Main {
    public static void main(String[] args) {
        Testable test = new MementoTest();
        test.run();
    }
}