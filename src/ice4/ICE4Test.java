package ice4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 82103
 */

public class ICE4Test {
    
    public ICE4Test() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of checkingTheNumberOfCharacters method, of class ICE4.
     */
    @Test
    public void testCheckingTheNumberOfCharacters() {
        System.out.println("checkingTheNumberOfCharacters");
        String word = "";
        char character = ' ';
        int expResult = 0;
        int result = ICE4.checkingTheNumberOfCharacters(word, character);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateMaximumCharacter method, of class ICE4.
     */
    @Test
    public void testCalculateMaximumCharacter() {
        System.out.println("calculateMaximumCharacter");
        char[] charArr = null;
        char expResult = ' ';
        char result = ICE4.calculateMaximumCharacter(charArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkWordExist method, of class ICE4.
     */
    @Test
    public void testCheckWordExist() {
        System.out.println("checkWordExist");
        String word = "";
        char character = ' ';
        boolean expResult = false;
        boolean result = ICE4.checkWordExist(word, character);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /*
     * Test for "Good"
    @Test
    public void testCheckingTheNumberOfCharacters() {
        System.out.println("checkingTheNumberOfCharacters");
        String word = "Banana";
        char character = 'a';
        int expResult = 3;
        int result = ICE4.checkingTheNumberOfCharacters(word, character);
        assertEquals(expResult, result);
    }*/
    
    /*
     * Test for "Good"
    @Test
    public void testCalculateMaximumCharacter() {
        System.out.println("calculateMaximumCharacter");
        char[] charArr = {'a','b','c'};
        char expResult = 'c';
        char result = ICE4.calculateMaximumCharacter(charArr);
        assertEquals(expResult, result);
    }*/

    /*
     * Test for "Good"
    @Test
    public void testCheckWordExist() {
        System.out.println("checkWordExist");
        String word = "Jewoo";
        char character = 'w';
        boolean expResult = true;
        boolean result = ICE4.checkWordExist(word, character);
        assertEquals(expResult, result);
    }*/
    
    /*
     * Test for "Bad"
    @Test
    public void testCheckingTheNumberOfCharacters() {
        System.out.println("checkingTheNumberOfCharacters");
        String word = "Banana";
        char character = 'a';
        int expResult = 1;
        int result = ICE4.checkingTheNumberOfCharacters(word, character);
        assertEquals(expResult, result);
    }*/
    
    /*
     * Test for "Bad"
    @Test
    public void testCalculateMaximumCharacter() {
        System.out.println("calculateMaximumCharacter");
        char[] charArr = {'a','b','c'};
        char expResult = 'd';
        char result = ICE4.calculateMaximumCharacter(charArr);
        assertEquals(expResult, result);
    }*/

    /*
     * Test for "Bad"
    @Test
    public void testCheckWordExist() {
        System.out.println("checkWordExist");
        String word = "Jewoo";
        char character = 'w';
        boolean expResult = false;
        boolean result = ICE4.checkWordExist(word, character);
        assertEquals(expResult, result);
    }*/
    
}