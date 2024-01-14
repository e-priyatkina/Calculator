package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plus() {
        int a = 1;
        int b = 1;

        int expected = 2;
        int actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = 1;
        actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);
    }

    public void minus() {
        int a = 1;
        int b = 1;

        int expected = 0;
        int actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = 3;
        actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);
    }

    public void multiplay() {
        int a = 1;
        int b = 1;

        int expected = 1;
        int actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = -2;
        actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);
    }

    public void pozitiveDivide() {
        int a = 1;
        int b = 1;

        int expected = 1;
        int actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);

        a = 2;
        b = -1;

        expected = -2;
        actual = calculatorService.calculatePlus(a, b);
        Assertions.assertEquals(expected, actual);
    }

    public void negativeDivide() {
        int a= 1;
        int b = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.calculateDivide(a, b));
    }
}
