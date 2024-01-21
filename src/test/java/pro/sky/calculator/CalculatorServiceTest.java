package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @Test
    public void plus() {
        int a = 1;
        int b = 1;

        int expected = 2;
        int actual = calculatorServiceImpl.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = 1;
        actual = calculatorServiceImpl.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minus() {
        int a = 1;
        int b = 1;

        int expected = 0;
        int actual = calculatorServiceImpl.calculateMinus(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = 3;
        actual = calculatorServiceImpl.calculateMinus(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiplay() {
        int a = 1;
        int b = 1;

        int expected = 1;
        int actual = calculatorServiceImpl.calculateMultiply(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = -2;
        actual = calculatorServiceImpl.calculateMultiply(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void pozitiveDivide() {
        int a = 1;
        int b = 1;

        float expected = 1.0F;
        float actual = calculatorServiceImpl.calculateDivide(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = -2.0F;
        actual = calculatorServiceImpl.calculateDivide(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeDivide() {
        int a= 1;
        int b = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorServiceImpl.calculateDivide(a, b));
    }
}
