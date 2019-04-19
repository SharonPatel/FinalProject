/*
 * Name: Sharon Patel
 * Student Id: 991503002
 * System10199 - Web Programming
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
 * @author Sharon
 */
public class SystemManagementTest {
    
    public SystemManagementTest() {
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
     * Test of getPlayerID method, of class SystemManagement.
     */

    @Test
    public void testSetPlayerIDGood() {
        System.out.println("setPlayerIDGoodTesting");
        int playerId = 8;
        boolean expResult = true;
        boolean result = SystemManagement.setPlayerID(playerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
    @Test
     public void testSetPlayerIDBad() {
        System.out.println("setPlayerIDBadTesting");
        int playerId = 3;
        boolean expResult = false;
        boolean result = SystemManagement.setPlayerID(playerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
      @Test
     public void testSetPlayerIDBoundry() {
        System.out.println("setPlayerIDBoundryTesting");
        int playerId = 5;
        boolean expResult = true;
        boolean result = SystemManagement.setPlayerID(playerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
