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
        JLabel version = new JLabel("Ön jelenleg a v1.4 verziót használja");
        version.setFont(new Font("Dialog",Font.PLAIN,12));
        
        //Rövid súgó
        JPanel helppanel = new JPanel();
        helppanel.setLayout(new GridLayout(6,0));
        JLabel helplabel = new JLabel("Súgó:");
        helplabel.setFont(new Font("Dialog",Font.BOLD,14));
        JLabel help1 = new JLabel("1. Adja meg az első számot!");
        help1.setFont(new Font("Dialog",Font.PLAIN,12));
        JLabel help2 = new JLabel("2. Kattintson az elvégezni kívánt műveletre!");
        help2.setFont(new Font("Dialog",Font.PLAIN,12));
        JLabel help3 = new JLabel("3. Adja meg a második számot!");
        help3.setFont(new Font("Dialog",Font.PLAIN,12));
        JLabel help4 = new JLabel("4. Ha további műveleteket szeretne megadni térjen vissza a 2-es pontra!");
        help4.setFont(new Font("Dialog",Font.PLAIN,12));
        JLabel help5 = new JLabel("5. Írassa ki az eredményt az (=) gommbal!");
        help5.setFont(new Font("Dialog",Font.PLAIN,12));
        
        helppanel.add(helplabel);
        helppanel.add(help1);
        helppanel.add(help2);
        helppanel.add(help3);
        helppanel.add(help4);
        helppanel.add(help5);
        
        //Szerzők cím
        JPanel authorLabel = new JPanel();
        JLabel authorTitle = new JLabel("A Program szerzői:");
        authorTitle.setFont(new Font("Dialog",Font.BOLD,16));
        authorLabel.add(authorTitle);
        
        //Szerzők listája
        JPanel authors = new JPanel();
        GridLayout agl = new GridLayout();
        agl.setColumns(2);
        agl.setRows(4);
        agl.setHgap(20);
        authors.setLayout(agl);
        
        JLabel av = new JLabel ("Ardó Virgínia Katalin");
        JLabel avn = new JLabel ("FJ7N0W");
        JLabel bn = new JLabel ("Banos Noémi");
        JLabel bnn = new JLabel ("U75RBH");
        JLabel hg = new JLabel ("Horváth Gabriella");
        JLabel hgn = new JLabel ("R8X8R6");
        JLabel sg = new JLabel ("Seres Gergő");
        JLabel sgn = new JLabel ("HMX501");
        
        authors.add(av);
        authors.add(avn);
        authors.add(bn);
        authors.add(bnn);
        authors.add(hg);
        authors.add(hgn);
        authors.add(sg);
        authors.add(sgn);
        
        
        //az ablak vázát adó főpanel összeállítása.
        JPanel wp = new JPanel();
        wp.add(title);
        wp.add(version);
        wp.add(helppanel);
        wp.add(authorLabel);
        wp.add(authors);
        
        // az ablak megjelenítése
        setContentPane(wp);
        pack();
        setVisible(true);

    }
}
