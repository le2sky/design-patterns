package org.pattern.behavioral.templateMethod;

import org.pattern.common.Testable;

public class TemplateMethodTest implements Testable {
    @Override
    public void run() {
        Player player = new Player();

        player.play(1);

        PlayerLevel level = new SuperLevel();

        player.upgradeLevel(level);

        player.play(2);

    }
}
