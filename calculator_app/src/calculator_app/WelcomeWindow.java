package rft_calculator;

import java.awt.*;
import javax.swing.*;


public class WelcomeWindow extends JFrame{
    public WelcomeWindow() {
        // az ablak konfigurálása (méret, átméretezhetőség, stb)
        Dimension size = new Dimension(450,500);
        setPreferredSize(size);
        setResizable(false);
        
        //A cím kialakítása
        JLabel title = new JLabel("Üdvözli a Java Számológép");
        title.setFont(new Font("Dialog",Font.BOLD,18));
        
        //A verizószám megjelenítése
        JLabel version = new JLabel("Ön jelenleg a v1.3 verziót használja");
        version.setFont(new Font("Dialog",Font.PLAIN,12));
        
        //Rövid súgó
        JPanel helppanel = new JPanel();
        helppanel.setLayout(new GridLayout(6,0));
        JLabel helplabel = new JLabel("Súgó:");
        JLabel help1 = new JLabel("1. Adja meg az első számot!");
        JLabel help2 = new JLabel("2. Kattintson az elvégezni kívánt műveletre!");
        JLabel help3 = new JLabel("3. Adja meg a második számot!");
        JLabel help4 = new JLabel("4. Ha további műveleteket szeretne megadni térjen vissza a 2-es pontra!");
        JLabel help5 = new JLabel("5. Írassa ki az eredményt az (=) gommbal!");
        
        helppanel.add(helplabel);
        helppanel.add(help1);
        helppanel.add(help2);
        helppanel.add(help3);
        helppanel.add(help4);
        helppanel.add(help5);
        
        
        //az ablak vázát adó főpanel összeállítása.
        JPanel wp = new JPanel();
        wp.add(title);
        wp.add(version);
        wp.add(helppanel);
        
        
        // az ablak megjelenítése
        setContentPane(wp);
        pack();
        setVisible(true);

    }
}
