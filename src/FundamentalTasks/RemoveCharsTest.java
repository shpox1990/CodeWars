package FundamentalTasks;

/**
 * Created By Vito, 27.12.17, 08:22
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCharsTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }
}
