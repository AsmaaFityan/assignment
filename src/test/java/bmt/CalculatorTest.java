package bmt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        double[] numbers = {2.5, 3.5};
        double expected = 6.0;
        double result = calculator.add(numbers);
        assertEquals(expected, result, 0.0001);
    } 
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double[] numbers = {5.0, 2.0};
        double expected = 3.0;
        double result = calculator.subtract(numbers);
        assertEquals(expected, result, 0.0001);
    }
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        double[] numbers = {2.0, 3.0};
        double expected = 6.0;
        double result = calculator.multiply(numbers);
        assertEquals(expected, result, 0.0001);
    }
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        double[] numbers = {6.0, 3.0};
        double expected = 2.0;
        double result = calculator.divide(numbers);
        assertEquals(expected, result, 0.0001);
    }
}