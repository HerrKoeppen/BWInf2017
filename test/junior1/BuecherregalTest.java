/*
 * JUnit-Testklasse fuer die Junioraufgabe 1.
 */
package junior1;

import java.util.ArrayList;
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
        ArrayList<Integer> testList1 = new ArrayList();
        testList1.add(168);
        testList1.add(170);
        testList1.add(202);
        testList1.add(211);
        testList1.add(229);
        testList1.add(233);
        testList1.add(254);
        testList1.add(260);
        testList1.add(272);
        testList1.add(306);
        testList1.add(307);
        Buecherregal vergleich = new Buecherregal(4,testList1);
        Buecherregal instance = new Buecherregal();
        instance.dateiNachAufgabe();
        // Hier bitte dann die erste Testdatei einlesen
        assertEquals(vergleich.anzahlDekofiguren,instance.anzahlDekofiguren);
        for (int i=0;i<vergleich.buecher.size();i=i+1){
            assertEquals(vergleich.buecher.get(i),instance.buecher.get(i));
        }
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
