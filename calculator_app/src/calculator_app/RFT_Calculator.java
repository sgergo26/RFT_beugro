
package rft_calculator;
import javax.swing.*;


public class RFT_Calculator {

    public static void main(String[] args)throws Exception{
        WelcomeWindow ww = new WelcomeWindow(){};
        ww.setTitle("Üdvözlet");
        ww.setAlwaysOnTop(true);
        
        CalculatorView calc = new CalculatorView(){};
        calc.setTitle("Szamologep");
        calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}
