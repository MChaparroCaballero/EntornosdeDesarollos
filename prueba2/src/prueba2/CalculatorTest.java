package prueba2;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
  
  @Test
  public void evaluatesFactorial() {
    Calculator calculator = new Calculator();
    int result = calculator.factorial(10);
    assertEquals(5, result);
  }
}
