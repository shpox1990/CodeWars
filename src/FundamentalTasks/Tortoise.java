package FundamentalTasks;

/**
 * Created By Vito, 18.06.18, 00:08
 */
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {

        double distanceInFeetsA = g;
        double distanceInFeetsB = 0;
        int[] time = new int[2];

        for (int i = 0; distanceInFeetsA >= distanceInFeetsB; i++) {
            distanceInFeetsA += ((double) v1 / 3600);
            distanceInFeetsB += ((double) v2 / 3600);
            int hours = i / 3600;
            int minutes = ((i % 3600) / 60);
            int seconds = (i % 60);
            time = new int[]{hours, minutes, seconds};

        }
        return time;
    }
}
