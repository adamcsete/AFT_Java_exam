/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzet_il2hzo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jani
 */
public class Negyzet_IL2HZOTest {
    
    public Negyzet_IL2HZOTest() {
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
     * Test of main method, of class Negyzet_IL2HZO.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Negyzet_IL2HZO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of negyzet method, of class Negyzet_IL2HZO.
     */
    @Test
    public void testNegyzet() {
        System.out.println("negyzet");
        int Bemenet = 0;
        int expResult = 0;
        int result = Negyzet_IL2HZO.negyzet(Bemenet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
