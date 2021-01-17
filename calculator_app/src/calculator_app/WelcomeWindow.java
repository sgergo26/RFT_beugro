package rft_calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class WelcomeWindow extends JFrame{
    public WelcomeWindow() {
        
        // az ablak konfigurálása (méret, átméretezhetőség, stb)
        Dimension size = new Dimension(450,400);
        setPreferredSize(size);
        setResizable(false);
        
        //A cím kialakítása
        JLabel title = new JLabel("Üdvözli a Java Számológép");
        title.setFont(new Font("Dialog",Font.BOLD,18));
        
        //A verizószám megjelenítése
        JLabel version = new JLabel("Ön jelenleg a v1.6 verziót használja");
        version.setFont(new Font("Dialog",Font.PLAIN,12));
        version.setForeground(java.awt.Color.green.darker());
        
        //Rövid súgó
        JPanel helppanel = new JPanel();
        helppanel.setLayout(new GridLayout(7,0));
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
        JLabel help6 = new JLabel("6. Válasszon egy szögfüggvényt, majd adja meg a számot!");
        help6.setFont(new Font("Dialog",Font.PLAIN,12));
        
        helppanel.add(helplabel);
        helppanel.add(help1);
        helppanel.add(help2);
        helppanel.add(help3);
        helppanel.add(help4);
        helppanel.add(help5);
        helppanel.add(help6);
        
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
        
        //A program céja
        JLabel rft = new JLabel();
        rft.setText("<html><div style='text-align: center;'>"
                + "A program A Rendszerfejlesztés Technológiája (NBT_IM715K3) <br>"
                + "tárgy vizsgabeugrójaként készült."
                + "</div></html>");
        rft.setFont(new Font("Dialog",Font.BOLD,14));
        rft.setForeground(java.awt.Color.red.darker());
        
        //Bezárásra szolgáló gomb
        JButton close = new JButton("A súgó bezárása");
        close.setBackground(java.awt.Color.red);
        close.setForeground(java.awt.Color.white);
        close.addActionListener(new CloseListener());
        
        //Az utolsó Build időpotnja
        JPanel bp = new JPanel();
        JLabel buildLabel = new JLabel("Az utolsó build odőpontja:");
        buildLabel.setFont(new Font("Dialog",Font.PLAIN,12));
        buildLabel.setForeground(java.awt.Color.lightGray);
        bp.add(buildLabel);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
        LocalDateTime now = LocalDateTime.now();  
        String nOW = dtf.format(now);
        JLabel buildDate = new JLabel();
        buildDate.setText(nOW);
        buildDate.setForeground(java.awt.Color.lightGray);
        bp.add(buildDate);
        
        //az ablak vázát adó főpanel összeállítása.
        JPanel wp = new JPanel();
        wp.add(title);
        wp.add(version);
        wp.add(helppanel);
        wp.add(authorLabel);
        wp.add(authors);
        wp.add(rft);
        wp.add(close);
        wp.add(bp);
        
        // az ablak megjelenítése
        setContentPane(wp);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    //Az ablak bezárását intéző eljárás
    private class CloseListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
        }
    }
}
