package org.pattern;

import org.pattern.common.Testable;
import org.pattern.structural.facade.FacadeTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new FacadeTest();
        test.run();
    }
}