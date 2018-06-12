package FundamentalTasks;

/**
 * Created By Vito, 25.03.18, 23:14
 */
public class Arge {
    //TODO
    public static int nbYear (int p0, double percent, int aug, int p) {
        int n = 0;
        while (p0 <= p) {
          int atTheEndOfTheYear = (int) (p0+(p0*(percent/100))+aug);
          p0=atTheEndOfTheYear;
          n++;
          if (p0>p)
              break;
        }
        return n;
    }}