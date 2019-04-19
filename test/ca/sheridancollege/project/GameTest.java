/*
 * DEVRAJ PATEL
 * STUDENT ID: 991 509 737
 * SYST10199 - WEB PROGRAMMING
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class GameTest {
    
    public GameTest() {
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
     * Test of getGameName method, of class Game.
     */
   

    /**
     * Test of playGame method, of class Game.
     */
    @Test
    public void testPlayGameGood() {
        System.out.println("playGame-Good");
        int i = 1;
        Game instance = null;
        int expResult = 0;
        int result = instance.playGame();
        assertEquals(expResult, result);
    }
     @Test
    public void testPlayGameBad() {
        System.out.println("playGame-Bad");
        int i = 15;
        Game instance = null;
        int expResult = 0;
        int result = instance.playGame();
        assertEquals(expResult, result);
    }
     @Test
    public void testPlayGameBoundary() {
        System.out.println("playGame-Boundary");
        int i = 10;
        Game instance = null;
        int expResult = 0;
        int result = instance.playGame();
        assertEquals(expResult, result);
    }

    /**
     * Test of declareWinner method, of class Game.
     */
    
}
