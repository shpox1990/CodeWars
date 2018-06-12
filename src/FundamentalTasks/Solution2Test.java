package FundamentalTasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created By Vito, 09.04.18, 22:32
 */
public class Solution2Test {
    //TODO
    @Test
    public void sampleTests() {
        assertEquals("4547-9-3", Solution2.insertDash(454793));
        assertEquals("123456", Solution2.insertDash(123456));
        assertEquals("1003-567", Solution2.insertDash(1003567));
    }
}
