package FundamentalTasks;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created By Vito, 26.05.18, 01:34
 */

public class isPalindromeTest {
    //TODO
    IsPalindrome palindrome = new IsPalindrome();

    @Test
    public void testPalindrome(){

        assertEquals(false, IsPalindrome.isPalindromeMethod("mama"));
        assertEquals(true, IsPalindrome.isPalindromeMethod("naan"));


    }

}
