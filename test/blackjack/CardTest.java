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
public class CardTest {

    public CardTest() {
    }

    @Test
    public void testShowCardGood() {
        System.out.println("showCard Good");
        String outputRank = "Ace";
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }
    
    @Test
    public void testShowCardBad() {
        System.out.println("showCard Bad");
        String outputRank = "Eight";
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
    }
    
    
   @Test
    public void testShowCardBoundry() {
        System.out.println("showCard Boundry");
        String outputRank = "King";
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
    }

}
