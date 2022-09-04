package org.pattern;

import org.pattern.common.Testable;
import org.pattern.structural.bridge.BridgeTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new BridgeTest();
        test.run();
    }
}