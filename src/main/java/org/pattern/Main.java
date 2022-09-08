package org.pattern;

import org.pattern.behavioral.state.StateTest;
import org.pattern.common.Testable;
public class Main {
    public static void main(String[] args) {
        Testable test = new StateTest();
        test.run();
    }
}