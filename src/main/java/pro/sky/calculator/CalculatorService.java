package pro.sky.calculator;

public interface CalculatorService {
    String hello();

    int calculatePlus(int a, int b);

    int calculateMinus(int a, int b);

    int calculateMultiply(int a, int b);

    default float calculateDivide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return (float) a / b;
    }
}
