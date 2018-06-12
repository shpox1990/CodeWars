package FundamentalTasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created By Vito, 26.12.17, 15:27
 */
public class SolutionTest {
    //TODO
    BasicOperations basicOps = new BasicOperations();

    /*@Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(basicOps.basicMath("+", 4, 7), is(11));
        assertThat(basicOps.basicMath("-", 15, 18), is(-3));
        assertThat(basicOps.basicMath("*", 5, 5), is(25));
        assertThat(basicOps.basicMath("/", 49, 7), is(7));
    }*/
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!"));
    }

}
