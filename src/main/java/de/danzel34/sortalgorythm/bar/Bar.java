package de.danzel34.sortalgorythm.bar;

import javax.swing.*;
import java.awt.*;

public class Bar extends JPanel {

    private int value;

    public Bar(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 10, value);
    }
}
