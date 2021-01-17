/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Event.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author ArdoV
 */
public class Menu {
    public static void main(String [] atgs){
        
        JFrame frame = new JFrame("Menu");
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame létrehozás
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        
    
    }
   
}

