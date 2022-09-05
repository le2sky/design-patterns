package org.pattern.structural.decorator;

import org.pattern.common.Testable;
import org.pattern.structural.decorator.coffee.*;

public class DecoratorTest implements Testable {
    @Override
    public void run() {
        Coffee kenyaCoffee = new KenyaCoffee();
        kenyaCoffee.brewing();


        System.out.println();
        Coffee kenyaLatte = new Latte(kenyaCoffee);
        kenyaLatte.brewing();

        System.out.println();
        Coffee mochaKenya = new MochaCoffee(new Latte(new KenyaCoffee()));
        mochaKenya.brewing();


        System.out.println();
        Coffee etiopiaCoffee = new MochaCoffee(new Latte(new EtiopiaCoffee()));
        etiopiaCoffee.brewing();

    }
}
