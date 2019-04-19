/*
 * DEVRAJ PATEL
 * STUDENT ID: 991 509 737
 * SYST10199 - WEB PROGRAMMING
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author devra
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getPlayerName method, of class Player.
     */
    
    //player can show their Scorehistory when player played minimum 1 game
    @Test
    public void testScoreHistoryGood() {
        System.out.println("getScoreHistory-Good");
        int score = 5;
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
    }
     @Test
    public void testScoreHistoryBad() {
        System.out.println("getScoreHistory-Bad");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
    }
     @Test
    public void testScoreHistoryBoundary() {
        System.out.println("getScoreHistory-Boundary");
        int score = 1;
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
    }

   
}
