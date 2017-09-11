/*
 * JUnit-Testklasse fuer die Junioraufgabe 1.
 */
package junior1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koeppen
 */
public class BuecherregalTest {
    
    public BuecherregalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dateiNachAufgabe method, of class Buecherregal.
     */
    @Test
    public void testDateiNachAufgabe() {
        System.out.println("dateiNachAufgabe");
        Buecherregal instance = new Buecherregal();
        instance.dateiNachAufgabe();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gruppiere method, of class Buecherregal.
     */
    @Test
    public void testGruppiere() {
        System.out.println("gruppiere");
        Buecherregal instance = new Buecherregal();
        instance.gruppiere();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loesungErlaubt method, of class Buecherregal.
     */
    @Test
    public void testLoesungErlaubt() {
        System.out.println("loesungErlaubt");
        Buecherregal instance = new Buecherregal();
        boolean expResult = false;
        boolean result = instance.loesungErlaubt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Buecherregal.
     * Muss nicht getestet werden...
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Buecherregal instance = new Buecherregal();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
