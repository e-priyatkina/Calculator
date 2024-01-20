package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTestsPlus")
    public void shouldCalculatorPlus(int num1, int num2, int num3) {
        int result = out.calculatePlus(num1, num2);
        Assertions.assertEquals(num3, result);
    }
    public static Stream<Arguments> provideParamsForTestsPlus() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(2, 2, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsMinus")
    public void shouldCalculatorMinus(int num1, int num2, int num3) {
        int result = out.calculateMinus(num1, num2);
        Assertions.assertEquals(num3, result);
    }
    public static Stream<Arguments> provideParamsForTestsMinus() {
        return Stream.of(
                Arguments.of(1, 1, 0),
                Arguments.of(3, 2, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsMultiply")
    public void shouldCalculatorMultiply(int num1, int num2, int num3) {
        int result = out.calculateMultiply(num1, num2);
        Assertions.assertEquals(num3, result);
    }
    public static Stream<Arguments> provideParamsForTestsMultiply() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, 3, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsDivide")
    public void shouldCalculatorDivide(int num1, int num2, float num3) {
        float result = out.calculateDivide(num1, num2);
        Assertions.assertEquals(num3, result);
    }
    public static Stream<Arguments> provideParamsForTestsDivide() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, 2, 1)
        );
    }
}
