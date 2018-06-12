package FundamentalTasks;

/**
 * Created By Vito, 09.04.18, 22:32
 */
public class Solution2 {
    //TODO
    public static String insertDash (int num) {

//        String number = String.valueOf(num);
        String finalString = "";
        int[] digits = String.valueOf(num).chars().map(Character::getNumericValue).toArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 == 0) {
                finalString += digits[i];
            }

            else if (digits[i] % 2 != 0 && digits[i+1] % 2 != 0) {
                finalString += digits[i]+"-";
            }else {
                finalString+=digits[i];
            }
        }
        return finalString;
    }
}
