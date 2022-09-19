package org.pattern;

import org.pattern.common.Testable;
import org.pattern.structural.proxy.ProxyTest;

public class Main {
    public static void main(String[] args) {
        Testable test = new ProxyTest();
        test.run();
    }
}