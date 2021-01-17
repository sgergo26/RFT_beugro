package rft_calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CalculatorView extends JFrame{
    
    // Mezők deklarálása
    private JTextField display;
    private static final Font BOLD_FONT = new Font(Font.MONOSPACED, Font.BOLD, 20);

    // Variables for calculator's state
    private boolean startNumber = true;                         // expecting number, not operation
    private String prevOperation = "=";                         // previous operation
    private Motor engine = new Motor();   // Reference to CalculatorEngine
    

    public CalculatorView(){
        
        
        // Window settings
        Dimension size = new Dimension(320, 400);
        setPreferredSize(size);
        setResizable(false);
        
        
        
        // Display field
        display = new JTextField("0", 18);
        display.setFont(BOLD_FONT);
        display.setHorizontalAlignment(JTextField.RIGHT);
        
        /** Egyéni teszteléshez használt rész
        JFrame frame = new JFrame("Menu");
        frame.setVisible(true);
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        
        JMenuBar menubar = new JMenuBar();
        //frame.setJMenuBar(menubar); Egyéni teszteléshez használt rész
        
        //Menubar létrehozása
        JMenu file = new JMenu("File");
        menubar.add(file);
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new exitAction());
        file.add(exit);
        
        JMenu help = new JMenu("Help");
        menubar.add(help);
        JMenuItem about = new JMenuItem("About");
        about.addActionListener(new ShowHelp());
        help.add(about);
        JMenuItem etc = new JMenuItem("Others");
        help.add(etc);

        JMenu edit = new JMenu("Edit");
        menubar.add(edit);
        JMenuItem delete = new JMenuItem("Delete");
        delete.addActionListener(new ClearKeyListener());
        edit.add(delete); 
        JMenuItem find = new JMenuItem("Find...");
        edit.add(find); 
        
        //Menü opciók megnevezése
        JMenu options = new JMenu("Options");
        menubar.add(options);
        JMenuItem general = new JMenuItem("Általános");
        options.add(general);
        JMenuItem scientific = new JMenuItem("Tudományos");
        scientific.addActionListener(new ShowAlert());
        options.add(scientific);
        JMenuItem graphic = new JMenuItem("Grafikus");
        graphic.addActionListener(new ShowAlert());
        options.add(graphic);
        

        // Operations panel 1
        ActionListener operationListener = new OperationListener();
        JPanel operationPanel1 = new JPanel();
        String[] operationPanelNames1 = new String[]{"+", "-", "*", "/","sin","cos","log"};
        operationPanel1.setLayout(new GridLayout(4, 4, 4, 4));
        for (String anOperationPanelNames1 : operationPanelNames1) {
            JButton b = new JButton(anOperationPanelNames1);
            operationPanel1.add(b);
            b.addActionListener(operationListener);
        }
        

        // Operations panel 2
        JPanel operationPanel2 = new JPanel();
        operationPanel2.setLayout(new GridLayout(1, 1, 2, 2));
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ClearKeyListener());
        operationPanel2.add(clearButton);
        JButton equalButton = new JButton("=");
        equalButton.addActionListener(operationListener);
        operationPanel2.add(equalButton);


        // Buttons panel
        JPanel buttonPanel = new JPanel();
        ActionListener numberListener = new NumberKeyListener();
        String[] buttonPanelNames = new String[]{"7", "8", "9", "4", "5", "6", "1", "2", "3", " ", "0", " "};
        buttonPanel.setLayout(new GridLayout(4, 3, 2, 2));
        for (String buttonPanelName : buttonPanelNames) {
            JButton b = new JButton(buttonPanelName);
            if (buttonPanelName.equals(" ")) {
                b.setEnabled(false);
            }
            b.addActionListener(numberListener);
            buttonPanel.add(b);
        }
        
        
        //Elrendezést elősegítő plusz panel
        JPanel up = new JPanel();
        up.setLayout(new BorderLayout());
        up.add(menubar, BorderLayout.PAGE_START);
        up.add(display, BorderLayout.PAGE_END);
        

        // Main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        //mainPanel.add(display, BorderLayout.PAGE_START);    //Előző verzió visszaállítását szolgálhatja
        mainPanel.add(operationPanel1, BorderLayout.EAST);
        mainPanel.add(operationPanel2, BorderLayout.SOUTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(up, BorderLayout.PAGE_START);

        // Window build
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        
    }
    
    
    private void actionClear() throws Exception{
        startNumber = true;
        display.setText("0");
        prevOperation = "=";
        engine.egyenlo("0");
    }
   
   

    class OperationListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e){
            String displayText = display.getText();
            if (startNumber) {
                try { //összeállítói kiegészítés
                    actionClear();
                } catch (Exception ex) {
                    Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex);
                }
                display.setText("ERROR - wrong operation");
            }else                                              // Sin,cos,log műveletek hozzáadása
                if(e.getActionCommand().equals("sin"))
            {
                display.setText("" + Math.sin(Double.valueOf(displayText).doubleValue()));
                
            }else
            if (e.getActionCommand().equals("cos"))
            {
                display.setText("" + Math.cos(Double.valueOf(displayText).doubleValue()));
                
            }
            else
            if (e.getActionCommand().equals("log"))
            {
                display.setText("" + Math.log(Double.valueOf(displayText).doubleValue()));
                
            }
            
            else{
                startNumber = true;
                try {
                    
                    switch (prevOperation) {
                        case "=":
                            engine.egyenlo(displayText);
                            break;
                        case "+":
                            engine.osszeadas(displayText);
                            break;
                        case "-":
                            engine.kivonas(displayText);
                            break;
                        case "/":
                            engine.osztas(displayText);
                            break;
                        case "*":
                            engine.szorzas(displayText);
                            break;
                        
                        
                            
                    }
                    display.setText("" + engine.eredmeny_String());
                } catch (NumberFormatException ex) {
                    try {   //összeállítói kiegészítés
                        actionClear();
                    } catch (Exception ex1) {
                        Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex);
                }
                prevOperation = e.getActionCommand();
            }
        }
    }
    
    
    class NumberKeyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String digit = e.getActionCommand();
            if (startNumber) {
                display.setText(digit);
                startNumber = false;
            } else {
                display.setText(display.getText() + digit);
            }
        }
    }
    

    class ClearKeyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e){
            try { //összeállítói kiegészítés
                actionClear();
            } catch (Exception ex) {
                Logger.getLogger(CalculatorView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class exitAction implements ActionListener{
        public void actionPerformed (ActionEvent e){
            System.exit(0);
        }
    }
    
    class ShowHelp implements ActionListener{
        public void actionPerformed (ActionEvent e){
            WelcomeWindow ww = new WelcomeWindow();
            ww.setTitle("Súgó");
        }
    }
    
    class ShowAlert implements ActionListener{
        public void actionPerformed (ActionEvent e){
            JOptionPane.showMessageDialog(null, "Ez a funkció még nincs kész", "Figyelmeztetés", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
