package org.pattern.creational.singleton;
import org.pattern.common.Testable;

import java.util.ArrayList;

public class SingletonTest implements Testable {
    @Override
    public void run() {
        ArrayList<ConnectionPool> cpList = new ArrayList<ConnectionPool>();
        int base = 0;
        double sum = 0.0;
        for(int i = 0; i < 100; i++) {
            ConnectionPool temp = ConnectionPool.getInstance();
            cpList.add(temp);
            if(i == 0) {
                base = temp.hashCode();
            }
            sum += temp.hashCode();
        }
        boolean b = (double) base == (sum / 100);
        System.out.println(b);
    }
}
