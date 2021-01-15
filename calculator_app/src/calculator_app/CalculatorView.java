
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
    }
    
}