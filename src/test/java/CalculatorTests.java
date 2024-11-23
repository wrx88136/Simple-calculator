package test.java;

import main.java.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition_2_3() {

        assertEquals(5, calculator.calculate(2, 3, '+'));
    }
    @Test
    public void testAddition_100_500() {

        assertEquals(600, calculator.calculate(100, 500, '+'));
    }
    @Test
    public void testSubtraction_89_20() {

        assertEquals(69, calculator.calculate(89, 20, '-'));
    }
    @Test
    public void testSubtraction_50_100() {
        double a = -50;
        assertEquals(a, calculator.calculate(50, 100, '-'));
    }
    @Test
    public void testMultiplication_3_3() {
        assertEquals(9, calculator.calculate(3, 3, '*'));
    }
    @Test
    public void testMultiplication_59_24() {
        assertEquals(1416, calculator.calculate(59, 24, '*'));
    }
    @Test
    public void testDivision_9_3() {
        assertEquals(3, calculator.calculate(9, 3, '/'));
    }
    @Test
    public void testMultiplication_8404_44() {
        assertEquals(369776, calculator.calculate(8404, 44, '*'));
    }
    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(5,0,'/');
        });
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
    @Test
    public void testInvalidOperator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(5,0,'$');
        });
        assertEquals("Invalid operator.", exception.getMessage());
    }
    @Test
    public void testPowerWithNegativeExponent() {
        assertEquals(0.25, calculator.calculate(2, -2, '^'));
    }
    @Test
    public void testPowerWithZeroExponent() {
        assertEquals(1, calculator.calculate(999999, 0, '^'));
    }
    @Test
    public void testPowerWithOneExponent() {
        assertEquals(50, calculator.calculate(50, 1, '^'));
    }
    @Test
    public void testPowerRandomNumber() {
        assertEquals(512, calculator.calculate(2, 9, '^'));
    }
    @Test
    public void testModulo() {
        assertEquals(1, calculator.calculate(10, 3, '%'));
        assertEquals(0, calculator.calculate(9, 3, '%'));
        assertEquals(1, calculator.calculate(5, 2, '%'));
    }
    @Test
    public void testModuloDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(5,0,'%');
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }


}
