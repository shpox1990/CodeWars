package FundamentalTasks;

/**
 * Created By Vito, 26.05.18, 01:30
 */
public class IsPalindrome {
    //check or given string is palindrome, if yes return true

    public static boolean isPalindromeMethod(String givenText){
        return givenText.equals(new StringBuilder(givenText).reverse().toString());
    }

}
