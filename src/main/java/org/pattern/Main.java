package org.pattern;

import org.pattern.behavioral.interpreter.InterpreterTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new InterpreterTest();
        test.run();
    }
}