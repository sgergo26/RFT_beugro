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
        
        
        JFrame frame2 = new JFrame();
        frame2.setSize(200,200);
        frame2.setVisible(false);
       
        //frame létrehozás
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        frame2.setJMenuBar(menubar);
        //Menubar létrehozása
        JMenu file = new JMenu("File");
        menubar.add(file);
        JMenuItem uj = new JMenuItem("New");
        file.add(uj);
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        
        JMenu help = new JMenu("Help");
        menubar.add(help);
        JMenuItem about = new JMenuItem("About");
        help.add(about);
        
        //Menü opciók megnevezése
        JMenu options = new JMenu("Options");
        menubar.add(options);
        JMenuItem general = new JMenuItem("Általános");
        options.add(general);
        JMenuItem scientific = new JMenuItem("Tudományos");
        options.add(scientific);
        JMenuItem graphic = new JMenuItem("Grafikus");
        graphic.add(graphic);
        
        //Kilépés 
      class exitAction implements ActionListener{
            
            @Override
            public void actionPerformed (ActionEvent e){
                System.exit(0);
                
            }
        }
        //Új ablak megnyitása
        exit.addActionListener(new exitAction());
        
        class newatction implements ActionListener{
            
            
            @Override
            public void actionPerformed (ActionEvent e){
                frame2.SetVisible(true);
                frame.dispose();
            }
        } 
        
    }
    

}

