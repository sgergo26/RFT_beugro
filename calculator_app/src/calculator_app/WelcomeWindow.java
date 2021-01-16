package rft_calculator;

import java.awt.*;
import javax.swing.*;


public class WelcomeWindow extends JFrame{
    public WelcomeWindow() {
        // az ablak konfigurálása (méret, átméretezhetőség, stb)
        Dimension size = new Dimension(320,300);
        setPreferredSize(size);
        setResizable(false);
        
        //A cím kialakítása
        JLabel title = new JLabel("Üdvözli a Java Számológép");
        title.setFont(new Font("Dialog",Font.BOLD,18));
        
        //A verizószám megjelenítése
        JLabel version = new JLabel("Ön jelenleg a v1.2 verziót használja");
        version.setFont(new Font("Dialog",Font.PLAIN,12));
        
        //az ablak vázát adó főpanel összeállítása.
        JPanel wp = new JPanel();
        wp.add(title);
        wp.add(version);
        
        
        // az ablak megjelenítése
        setContentPane(wp);
        pack();
        setVisible(true);

    }
}
