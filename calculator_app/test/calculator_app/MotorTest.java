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
    public void testEredmeny_String() {
        System.out.println("eredmeny_String");
        Motor instance = new Motor();
        String expResult = "";
        String result = instance.eredmeny_String();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of osszeadas method, of class Motor.
     */
    @Test
    public void testOsszeadas() throws Exception {
        System.out.println("osszeadas");
        String szam = "";
        Motor instance = new Motor();
        instance.osszeadas(szam);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kivonas method, of class Motor.
     */
    @Test
    public void testKivonas() throws Exception {
        System.out.println("kivonas");
        String number = "";
        Motor instance = new Motor();
        instance.kivonas(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of szorzas method, of class Motor.
     */
    @Test
    public void testSzorzas() throws Exception {
        System.out.println("szorzas");
        String number = "";
        Motor instance = new Motor();
        instance.szorzas(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of osztas method, of class Motor.
     */
    @Test
    public void testOsztas() throws Exception {
        System.out.println("osztas");
        String number = "";
        Motor instance = new Motor();
        instance.osztas(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
