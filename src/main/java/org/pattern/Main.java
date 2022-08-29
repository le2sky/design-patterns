package org.pattern;

import org.pattern.behavioral.templateMethod.TemplateMethodTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new TemplateMethodTest();
        test.run();

    }
}