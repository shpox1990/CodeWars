package FundamentalTasks;

import java.util.stream.IntStream;

/**
 * Created By Vito, 26.12.17, 08:28
 */
public class FindSmallestInteger {

    //my solution
    /*
    public static int findSmallestInteger(int[] listOfInts){
        int smaller = listOfInts[0];
        for (int number : listOfInts){

            if (number<smaller){
                smaller = number;
                System.out.println("Smaller is now: "+smaller);
            }
            else {
                System.out.println("Number "+number+ " is bigger than "+smaller);
            }
        }
        return smaller;
    }
    */

    //CodeWars users solution
    public static int findSmallestInteger(int[] args){
        return IntStream.of(args).min().getAsInt();
    }
}
