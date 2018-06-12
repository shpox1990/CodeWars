package FundamentalTasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created By Vito, 26.12.17, 14:58
 */
public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(eoo.even_or_odd(6), "Even");
        assertEquals(eoo.even_or_odd(7), "Odd");
    }
}
