package mediumTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MediumTestClass {

    Calculator calc = new Calculator();


    @Test (groups = { "Smoke" })
    public void testAverageValue() {
        double actualResult = calc.averageValue(10, 15,21);
        assertEquals("average value of 10, 15, 21 must be 15.333333333333334", 15.333333333333334, actualResult);
    }

    @Test
    public void testIsEven() {
        boolean actualResult = calc.isEven(10);
        //assertEquals("10^2 must be 100.0", 100.0, actualResult);
        assertTrue(actualResult, "10 must be an even");
    }

    @Test
    public void testIsOdd() {
        boolean actualResult = calc.isEven(9);
        //assertEquals("10^2 must be 100.0", 100.0, actualResult);
        assertFalse(actualResult, "9 must be an odd");
    }

    @Test
    public void testBiggerInt() {
        int actualResult = calc.biggerInt(10, 21);
        assertEquals("bigger value of 21 must be 21", 21, actualResult);
    }

}
