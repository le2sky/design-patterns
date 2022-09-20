package org.pattern.behavioral.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {

    // 그림 그리는 색
    private Color color = Color.red;

    // 그림 그리기를 할 점의 변경
    private int radius = 6 ;

    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
