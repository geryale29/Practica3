/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package myutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gerya
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = null;
        String expResult = null;
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 29;
        int month = 8;
        int year = 2004;
        int expResult = 18;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = -2;
        double expResult = -1;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
