package org.pattern;

import org.pattern.common.Testable;
import org.pattern.structural.adapter.AdapterTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new AdapterTest();
        test.run();
    }
}