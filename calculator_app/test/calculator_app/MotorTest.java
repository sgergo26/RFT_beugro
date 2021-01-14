/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_app;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class MotorTest {
    
    public MotorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of eredmeny_String method, of class Motor.
     */
    @Test
    public void testEredmeny_String() throws Exception {
        System.out.println("eredmeny_String");
        Motor instance = new Motor();
        String szam = "45.0";
        // Az aktual_ertek értéke 0-val lesz egyenlő?
        instance.osszeadas(szam);
        String eredmeny =  instance.eredmeny_String();
        String exp = "45";
        assertEquals(exp, eredmeny);
    }

    /**
     * Test of osszeadas method, of class Motor.
     */
    @Test
    public void testOsszeadas() throws Exception {
        System.out.println("osszeadas");
        String szam = "45.0";
        String szam2 = "55.8";
        
        double atszam = Double.parseDouble(szam);
        double atszam2 = Double.parseDouble(szam2);
        double eredmeny = atszam + atszam2;
        
        Motor instance = new Motor();
        instance.osszeadas(szam);
        instance.osszeadas(szam2);
        /*
        A logikai vizsgálat azért szükséges, mert a tesztadatok típusát segít meghatározni és konvertálni azokat string típusra.
        Ily módon hasonlítható össze a teszteredmény a várható eredménnyel,
        hiszen csak az eredmeny_String() metódus segítségével lehet az aktual_ertek változó értékét kiolvasni.
        */
        if(eredmeny % 1.0 == 0)
        {
            String ref = Integer.toString((int)eredmeny);
            assertEquals(ref, instance.eredmeny_String());
            
        }
        else
        {
            String ref = String.valueOf(eredmeny);
            assertEquals(ref, instance.eredmeny_String());
        }
    }

    /**
     * Test of kivonas method, of class Motor.
     */
    @Test
    public void testKivonas() throws Exception {
        System.out.println("kivonas");
        String szam = "95.7";
        String szam2 = "55.8";
        
        double atszam = Double.parseDouble(szam);
        double atszam2 = Double.parseDouble(szam2);
        double eredmeny = atszam - atszam2;
        
        Motor instance = new Motor();
        /*
        A aktual_ertek változó értéke null, ezért először hozzá kell adni az első számot
        */
        instance.osszeadas(szam);
        instance.kivonas(szam2);
        /*
        A logikai vizsgálat azért szükséges, mert a tesztadatok típusát segít meghatározni és konvertálni azokat string típusra.
        Ily módon hasonlítható össze a teszteredmény a várható eredménnyel,
        hiszen csak az eredmeny_String() metódus segítségével lehet az aktual_ertek változó értékét kiolvasni.
        */
        if(eredmeny % 1.0 == 0)
        {
            String ref = Integer.toString((int)eredmeny);
            assertEquals(ref, instance.eredmeny_String());
            
        }
        else
        {
            String ref = String.valueOf(eredmeny);
            assertEquals(ref, instance.eredmeny_String());
        }
    }

    /**
     * Test of szorzas method, of class Motor.
     */
    @Test
    public void testSzorzas() throws Exception {
        System.out.println("szorzas");
        String szam = "95.7";
        String szam2 = "55.8";
        
        double atszam = Double.parseDouble(szam);
        double atszam2 = Double.parseDouble(szam2);
        double eredmeny = atszam * atszam2;
        
        Motor instance = new Motor();
        /*
        A aktual_ertek változó értéke null, ezért először hozzá kell adni az első számot
        */
        instance.osszeadas(szam);
        instance.szorzas(szam2);
        /*
        A logikai vizsgálat azért szükséges, mert a tesztadatok típusát segít meghatározni és konvertálni azokat string típusra.
        Ily módon hasonlítható össze a teszteredmény a várható eredménnyel,
        hiszen csak az eredmeny_String() metódus segítségével lehet az aktual_ertek változó értékét kiolvasni.
        */
        if(eredmeny % 1.0 == 0)
        {
            String ref = Integer.toString((int)eredmeny);
            assertEquals(ref, instance.eredmeny_String());
            
        }
        else
        {
            String ref = String.valueOf(eredmeny);
            assertEquals(ref, instance.eredmeny_String());
        }
    }

    /**
     * Test of osztas method, of class Motor.
     */
     @Test
    public void testOsztas() throws Exception {
        System.out.println("osztas");
        String szam = "95.7";
        String szam2 = "7";
        
        double atszam = Double.parseDouble(szam);
        double atszam2 = Double.parseDouble(szam2);
        double eredmeny;
        try
        {
             eredmeny = atszam / atszam2;
        }
        catch(ArithmeticException e)
        {
            eredmeny = atszam;
        } 
        
        Motor instance = new Motor();
        /*
        A aktual_ertek változó értéke null, ezért először hozzá kell adni az első számot
        */
        instance.osszeadas(szam);
        instance.osztas(szam2);
        /*
        A logikai vizsgálat azért szükséges, mert a tesztadatok típusát segít meghatározni és konvertálni azokat string típusra.
        Ily módon hasonlítható össze a teszteredmény a várható eredménnyel,
        hiszen csak az eredmeny_String() metódus segítségével lehet az aktual_ertek változó értékét kiolvasni.
        */
        try
        {
            if(eredmeny % 1.0 == 0)
            {
                String ref = Integer.toString((int)eredmeny);
                assertEquals(ref, instance.eredmeny_String());

            }
            else
            {
                String ref = String.valueOf(eredmeny);
                assertEquals(ref, instance.eredmeny_String());
            } 
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException!");
           
        }
    }
    
}
