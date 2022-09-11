package org.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gamer {
    private int money;
    private ArrayList<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname = {
            "사과", "포도", "바나나", "귤",
    };

    private String getFruit() {                     // 과일을 1개 얻는다.
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "good~ ";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if(dice == 1) {
            money += 100;
            System.out.println("돈이 증가했습니다.");
        } else if(dice == 2) {
            money /= 2;
            System.out.println("돈이 반으로 줄었습니다.");
        } else if(dice == 6) {
            String f = getFruit();
            System.out.println("과일 (" + f + ")을 받았습니다.");
            fruits.add(f);
        } else {
            System.out.println("아무일도 일어나지 않았습니다.");
        }
    }


    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator<String> fruit = fruits.iterator();
        while(fruit.hasNext()) {
            String name = fruit.next();
            if(name.startsWith("good~")) {
                memento.addFruit(name);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }


    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                ", random=" + random +
                '}';
    }
}
