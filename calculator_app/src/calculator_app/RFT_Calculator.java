
package rft_calculator;
import javax.swing.*;


public class RFT_Calculator {

    public static void main(String[] args)throws Exception{
        
        //Az üdvözlőképernyő példányosítása
        WelcomeWindow ww = new WelcomeWindow(){};
        ww.setTitle("Üdvözlet");
        ww.setAlwaysOnTop(true);
        
        //A főképernyő példányosítása
        CalculatorView calc = new CalculatorView(){};
        calc.setTitle("Szamologep");
        calc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }  
}
