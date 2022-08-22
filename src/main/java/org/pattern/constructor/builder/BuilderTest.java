package org.pattern.constructor.builder;

import org.pattern.common.Testable;
import org.pattern.constructor.builder.effective.Calzone;
import org.pattern.constructor.builder.effective.NyPizza.Size;
import org.pattern.constructor.builder.effective.Pizza.Topping;
import org.pattern.constructor.builder.effective.Pizza;
import org.pattern.constructor.builder.effective.NyPizza;


public class BuilderTest implements Testable {
    @Override
    public void run() {
        Pizza nyPizza = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE)
                .addTopping(Topping.ONION).build();


        Pizza calzone = new Calzone.Builder().addTopping(Topping.HAM).addTopping(Topping.PEPPER)
                .sauceInside().build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
