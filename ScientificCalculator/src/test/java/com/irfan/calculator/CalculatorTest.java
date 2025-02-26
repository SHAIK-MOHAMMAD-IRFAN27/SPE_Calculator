package com.irfan.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calc.squareRoot(16), 0.001);
        assertEquals(5.0, calc.squareRoot(25), 0.001);  // Another perfect square
        assertEquals(0.0, calc.squareRoot(0), 0.001);   // Edge case: sqrt(0)
        
}
    

    @Test
    public void testFactorial() {
        assertEquals(120, calc.factorial(5));  // Normal case
        assertEquals(1, calc.factorial(0));    // Edge case: factorial(0)
        assertEquals(1, calc.factorial(1));    // Edge case: factorial(1)
        assertEquals(2, calc.factorial(2));    // Smallest positive non-trivial case
        assertEquals(3628800, calc.factorial(10)); // Large factorial case
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, calc.naturalLog(Math.E), 0.001);  // ln(e) = 1
        assertEquals(0.0, calc.naturalLog(1), 0.001);       // ln(1) = 0
        // assertEquals(Double.NEGATIVE_INFINITY, calc.naturalLog(0), 0.001); // ln(0) → -∞
        // assertEquals(Double.NaN, calc.naturalLog(-1), 0.001); // ln(negative) is NaN
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calc.power(2, 3), 0.001);  // 2^3 = 8
        assertEquals(1.0, calc.power(5, 0), 0.001);  // x^0 = 1
        assertEquals(0.0, calc.power(0, 5), 0.001);  // 0^x = 0 for x > 0
        assertEquals(1.0, calc.power(0, 0), 0.001);  // 0^0 is generally treated as 1
        assertEquals(0.25, calc.power(2, -2), 0.001); // 2^-2 = 1/4
        assertEquals(-8.0, calc.power(-2, 3), 0.001); // (-2)^3 = -8
        assertEquals(4.0, calc.power(-2, 2), 0.001);  // (-2)^2 = 4
    }
}