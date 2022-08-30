package org.pattern;

import org.pattern.behavioral.templateMethod.TemplateMethodTest;
import org.pattern.common.Testable;
import org.pattern.creational.factoryMethod.FactoryMethodTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new FactoryMethodTest();
        test.run();

    }
}