package org.example;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class appWindow extends  JFrame{

    public appWindow() {

        /* Jframe is the WINDOW in the OS with the taskbar and calling pack() makes it squeeze to fit everything with no extra space so the size of the window is inside of draw pane */
        setTitle("Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPane draw = new drawPane();
        add(draw);
        pack();

        Boolean[] keysPressed = new Boolean[256];

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==524){return;}//ignore annoying win key error
                keysPressed[e.getKeyCode()] = true;
            }
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==524){return;}//ignore annoying win key error
                keysPressed[e.getKeyCode()] = false;
            }
        });

        setVisible(true);
    }

}

