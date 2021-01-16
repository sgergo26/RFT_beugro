package rft_calculator;

import java.awt.*;
import javax.swing.*;


public class WelcomeWindow extends JFrame{
    public WelcomeWindow() {
        Dimension size = new Dimension(320,300);
        setPreferredSize(size);
        setResizable(false);
        
        JPanel wp = new JPanel();
        
        setContentPane(wp);
        pack();
        setVisible(true);
    }
}
