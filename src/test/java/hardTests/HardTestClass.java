package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

  Calculator calc = new Calculator();

  @Test
  public void testSumOfIntegers() {
    long actualResult = calc.sumOfIntegers(2, 5, 10, 4);
    assertEquals("sum of integers: 2, 5, 10, 4 must be 21", 21, actualResult);
  }

  @Test
  public void testCheckDivideByZerro() {
    long actualResult = calc.checkDivideByZerro(2, 0);
    assertEquals("b shouldn't be Zerro ", -100, actualResult);

  }

  @Test
  public void testCheckDivideByNonZerro() {
    long actualResult = calc.checkDivideByZerro(2, 1);
    assertEquals("2/1 should be 2", 2, actualResult);

  }


}
