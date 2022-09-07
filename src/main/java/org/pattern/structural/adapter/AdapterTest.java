package org.pattern.structural.adapter;

import org.pattern.common.Testable;

public class AdapterTest implements Testable {
    @Override
    public void run() {
        Print print = new PrintBanenr("hello");
        print.printStrong();
        print.printWeek();
    }
}
