package org.pattern.behavioral.state;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level) {
        level.showLevelMessage();
        this.level = level;
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void run() {
        level.run();
    }

    public void jump() {
        level.jump();
    }
    public void turn() {
        level.turn();
    }
    public void play(int count) {
        run();
        for(int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
