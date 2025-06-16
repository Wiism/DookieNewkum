package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class drawPane extends JComponent {

    public int i = 0;

    final int HEIGHT = 300;
    final int WIDTH = 300;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);  // Set your intended drawing area
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0,0 ,i*100,i*100);
        g.drawLine(0,0 ,i*100,0);
        g.drawLine(0,0 ,0,i*100);
    }

}
