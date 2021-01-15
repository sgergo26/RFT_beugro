package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalculatorView {
	// A szövegmező deklarálása
    private JTextField display;
	// A szövegmező betűtípus, betűméret és betűvastagságának beállítása
    private static final Font BOLD_FONT = new Font(Font.MONOSPACED, Font.BOLD, 20);
	
     // Változók a számológép állapotához:
    private boolean startNumber = true;                         // számot várunk el, nem pedig műveletet
    private String prevOperation = "=";                         // előző művelet
    private Motor engine = new Motor();                          // a motor referencia-változója
	
	//Az osztály konstruktora
    public CalculatorView(){
        // Ablak beállítások (windows)
        Dimension size = new Dimension(320, 300);
        setPreferredSize(size);
        setResizable(false);
		
		// Megjelenítési mező beállítások
        display = new JTextField("0", 18);
        display.setFont(BOLD_FONT);
        display.setHorizontalAlignment(JTextField.RIGHT);
		
		// 1. operációs panel
        ActionListener operationListener = new OperationListener();
        JPanel operationPanel1 = new JPanel();
		//Műveleti jelek és hozzá gombok adása
        String[] operationPanelNames1 = new String[]{"+", "-", "*", "/"};
        operationPanel1.setLayout(new GridLayout(2, 2, 2, 2));
        for (String anOperationPanelNames1 : operationPanelNames1) {
            JButton b = new JButton(anOperationPanelNames1);
            operationPanel1.add(b);
            b.addActionListener(operationListener);
        }
		
		 // 2. operációs panel
        JPanel operationPanel2 = new JPanel();
        operationPanel2.setLayout(new GridLayout(1, 1, 2, 2));
		//Törlés gomb hozzáadása az operációs panelhez
		JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ClearKeyListener());
        operationPanel2.add(clearButton);
		// Egyenlőségjel gomb hozzáadása az operációs panelhez
		JButton equalButton = new JButton("=");
        equalButton.addActionListener(operationListener);
        operationPanel2.add(equalButton);
		
		// Gomb panel 
        JPanel buttonPanel = new JPanel();
        ActionListener numberListener = new NumberKeyListener();
		//Feltöltés a számjegyeket reprezentáló gombokkal
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
    }
    
}