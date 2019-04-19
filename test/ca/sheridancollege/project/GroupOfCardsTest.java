/*
 * Name: Sharon Patel
 * Student Id: 991503002
 * System10199 - Web Programming
 */
package ca.sheridancollege.project;

import java.util.Scanner;
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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of main method, of class GroupOfCards.
     */
   
    
   @Test
    public void testShowCard() {
        System.out.println("showCardGoodtest");
        int no = 4;
        boolean expResult = true;
        boolean result = GroupOfCards.showCard(no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
 @Test
    public void testShowCardbad() {
         Scanner in = new Scanner(System.in);
        System.out.println("showCardbadtest");
        
        int no = 9;
        boolean expResult = false;
        boolean result = GroupOfCards.showCard(no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testShowCardboundry() {
        System.out.println("showCardboundrytest");
        int no = 5;
        boolean expResult = true;
        boolean result = GroupOfCards.showCard(no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
//     @Test
//    public void testSuffleGood() {
//        System.out.println("SuffleGood");
//        int suffleList = 2;
//        boolean expResult = true;
//        boolean result = GroupOfCards.showCard(no);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
//     @Test
//    public void testSuffleBad() {
//        System.out.println("SuffleBad");
//        int no = 7;
//        boolean expResult = true;
//        boolean result = GroupOfCards.showCard(no);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
//     @Test
//    public void testSuffleboundry() {
//        System.out.println("showCardboundry");
//        int no = 5;
//        boolean expResult = true;
//        boolean result = GroupOfCards.showCard(no);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       
//    }
    
   
    /**
     * Test of shuffle method, of class GroupOfCards.
     */

}
