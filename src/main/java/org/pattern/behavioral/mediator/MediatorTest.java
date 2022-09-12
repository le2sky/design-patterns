package org.pattern.behavioral.mediator;

import org.pattern.common.Testable;

public class MediatorTest implements Testable {
    @Override
    public void run() {
        new LoginFrame("Mediator Sample");
    }
}
