package org.pattern.behavioral.strategy;

import org.pattern.behavioral.strategy.scheduler.*;
import org.pattern.common.Testable;

import java.io.IOException;

public class StrategyTest implements Testable {
    @Override
    public void run() {
        System.out.println("전화 상담 할당 방식을 선택 하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");
        System.out.println("A : 상담원이 상담 가져가기"); // 새로운 전략이 추가 가능 (확장성이 높다.)

        try {
            int ch = System.in.read();
            Scheduler scheduler = null;
            if(ch =='r' || ch =='R') {
                scheduler = new RoundRobin();
            }
            else if(ch =='l' || ch =='L') {
                scheduler = new LeastJob();
            }
            else if(ch =='p' || ch =='P') {
                scheduler = new PriorityAllocation();
            }
            else if (ch =='a' || ch =='A') {
                scheduler = new AgentGetCall();
            }
            else {
                System.out.println("not support");
                return;
            }

            scheduler.getNextCall();
            scheduler.sendCallToAgent();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
