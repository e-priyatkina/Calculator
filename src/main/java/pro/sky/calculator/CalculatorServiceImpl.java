package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int calculatePlus(int a, int b) {
        return a + b;
    }

    @Override
    public int calculateMinus(int a, int b) {
        return a - b;
    }

    @Override
    public int calculateMultiply(int a, int b) {
        return a * b;
    }

    @Override
    public float calculateDivide(int a, int b) {
        return (float) a / b;
    }
}
