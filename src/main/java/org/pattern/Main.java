package org.pattern;

import org.pattern.common.Testable;
import org.pattern.constructor.abstractFactory.AbstractFactoryTest;
import org.pattern.constructor.prototype.PrototypeTest;
import org.pattern.constructor.singleton.SingletonTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new AbstractFactoryTest();
        test.run();
    }
}