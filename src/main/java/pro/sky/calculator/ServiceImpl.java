package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ServiceInterface {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String calculatePlus(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    @Override
    public String calculateMinus(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    @Override
    public String calculateMultiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    @Override
    public String calculateDivide(int a, int b) {

        if (b == 0) {
            return "На ноль делить нельзя!";
        } else {
            float c = (float) a / b;
            return a + " / " + b + " = " + c;
        }
    }
}
