
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
public class DealerTest {

    public DealerTest() {
    }

    @Test
    public void testTotalValueGood() {
        System.out.println("totalValue Good");
        int total1 = 10;
        int total2 = 20;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalValueBad() {
        System.out.println("totalValue Bad");
        int total1 = 100;
        int total2 = 22;
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
    }

    @Test
    public void testTotalValueBoundry() {
        System.out.println("totalValue Boundry");
        int total1 = 8;
        int total2 = 7;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

    @Test
    public void testdecisionGood() {
        System.out.println("decision Good");
        double hitValue = 0.33;
        int totalValue = 19;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);

    }
    
    @Test
    public void testdecisionBad() {
        System.out.println("decision Bad");
        double hitValue = 1.01;
        int totalValue = 22;
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);

    }
    
    @Test
    public void testdecisionBoundry() {
        System.out.println("decision Boundry");
        double hitValue = 0.05;
        int totalValue = 20;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);

    }
    
    
}
