/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzet_il2hzo;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author jani
 */
public class Negyzet_IL2HZONGTest {
    
    /*@Test
    public void testNegyzet() {
        System.out.println("negyzet");
        int Bemenet = 0;
        int expResult = 0;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    @Test
    public void testNegyzet1() {
        System.out.println("negyzet");
        int Bemenet = 3;
        int expResult = 9;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNegyzet2() {
        System.out.println("negyzet");
        int Bemenet = 1;
        int expResult = 1;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNegyzet3() {
        System.out.println("negyzet");
        int Bemenet = 5;
        int expResult = 25;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    //@Test
    public void testNegyzet4() {
        System.out.println("negyzet");
        int Bemenet = 6;
        int expResult = 36;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNegyzet5() {
        System.out.println("negyzet");
        int Bemenet = 7;
        int expResult = 49;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
    }
    
}
