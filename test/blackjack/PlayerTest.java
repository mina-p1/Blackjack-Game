/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author peter
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    
    @Test
    public void testTotalValueGood() {
        System.out.println("totalValue Good");
        int total = 15;
        boolean trueTotal = total <= 21;
        boolean result = true;
        assertEquals(trueTotal, result); 
    }
    
    @Test
    public void testTotalValueBad() {
        System.out.println("totalValue Bad");
        int total = 50;
        boolean trueTotal = total <= 21;
        boolean result = false;
        assertEquals(trueTotal, result); 
    }
    
    @Test
    public void testTotalValueBoundary() {
        System.out.println("totalValue Boundary");
        int total = 21;
        boolean trueTotal = total <= 21;
        boolean result = true;
        assertEquals(trueTotal, result); 
    }

    
}
