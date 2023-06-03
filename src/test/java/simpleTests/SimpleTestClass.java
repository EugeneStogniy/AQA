package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

  Calculator calc = new Calculator();

  @Test
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals("10 + 5 must be 15", 15, actualResult);
  }



  @Test

  public void testSubtraction() {
    int actualResult = calc.subtraction(10, 5);
    assertEquals("10 - 5 must be 5", 5, actualResult);
  }

  @Test(groups = { "Regression" })
  public void testMultiplication() {
    double actualResult = calc.multiplication(10, 5);
    assertEquals("10 * 5 must be 50.0", 50.0, actualResult);

  }

  @Test
  public void testDivision() {
    double actualResult = calc.division(10, 5);
    assertEquals("10 / 5 must be 2.0", 2.0, actualResult);
  }

  @Test
  public void testSquareRoot() {
    double actualResult = calc.squareRoot(10);
    assertEquals("square root of 10 must be 3.1622776601683795", 3.1622776601683795, actualResult);
  }

  @Test
  public void testX2() {
    double actualResult = calc.x2(10);
    assertEquals("10^2 must be 100.0", 100.0, actualResult);
  }



}
