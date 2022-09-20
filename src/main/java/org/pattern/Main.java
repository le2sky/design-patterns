package org.pattern;

import org.pattern.behavioral.command.CommandTest;
import org.pattern.common.Testable;

public class Main {
    public static void main(String[] args) {
        Testable test = new CommandTest("test");
        test.run();
    }
}