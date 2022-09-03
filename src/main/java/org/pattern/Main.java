package org.pattern;

import org.pattern.behavioral.strategy.StrategyTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new StrategyTest();
        test.run();
    }
}