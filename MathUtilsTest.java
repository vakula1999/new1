import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, mathUtils.multiply(3, 5));
    }

    @Test
    public void testDivideByNonZero() {
        assertEquals(2.0, mathUtils.divide(10, 5), 0);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(10, 0), 0);
    }
}
