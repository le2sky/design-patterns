package org.pattern.structural.flyweight;

import org.pattern.common.Testable;

public class FlyweightTest implements Testable {
    @Override
    public void run() {
        BigString bs = new BigString("AB");
        bs.print();
    }
}
