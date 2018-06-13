package FundamentalTasks;

import java.util.stream.IntStream;

/**
 * Created By Vito, 12.06.18, 22:59
 */
public class EvenOrOddInArray {
    //sum all numbers in array and check or its even or odd
    public static String oddOrEven(int[] array) {
        int sum = IntStream.of(array).sum();

        if (sum % 2 == 0) return "even";
        else return "odd";
    }
}
