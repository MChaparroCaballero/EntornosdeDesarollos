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
    int result = calculator.factorial(5);
    assertEquals(120, result);
  }
  
  @Test
  public void evaluatesPrimo() {
    Calculator calculator = new Calculator();
    boolean result = calculator.primo(2);
    assertEquals(true, result);
  }
  
  @Test
  public void evaluatesPerfecto() {
    Calculator calculator = new Calculator();
    boolean result = calculator.perfecto(6);
    assertEquals(true, result);
  }
}
