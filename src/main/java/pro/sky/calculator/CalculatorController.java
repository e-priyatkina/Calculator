package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceImpl calculatorServiceImpl;

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String hello() {
        return calculatorServiceImpl.hello();
    }

    @GetMapping("/plus")
    public String calculatePlus(
            @RequestParam (required = false) Integer num1,
            @RequestParam (required = false) Integer num2)
        {
        if (num1 == null || num2 == null) {
            return "Введите оба значения!";
        } else {
            return num1 + " + " + num2 + " = " + calculatorServiceImpl.calculatePlus(num1, num2);
        }
    }

    @GetMapping("/minus")
    public String calculateMinus(
            @RequestParam (required = false) Integer num1,
            @RequestParam (required = false) Integer num2)
    {
        if (num1 == null || num2 == null) {
            return "Введите оба значения!";
        } else {
            return num1 + " - " + num2 + " = " + calculatorServiceImpl.calculateMinus(num1, num2);
        }
    }

    @GetMapping("/multiply")
    public String calculateMultiply(
            @RequestParam (required = false) Integer num1,
            @RequestParam (required = false) Integer num2)
    {
        if (num1 == null || num2 == null) {
            return "Введите оба значения!";
        } else {
            return num1 + " * " + num2 + " = " + calculatorServiceImpl.calculateMultiply(num1, num2);
        }
    }

    @GetMapping("/divide")
    public String calculateDivide(
            @RequestParam (required = false) Integer num1,
            @RequestParam (required = false) Integer num2)
    {
        if (num1 == null || num2 == null) {
            return "Введите оба значения!";
        } else if (num2 == 0) {
            return "На ноль делить нельзя!";
        } else {
            return num1 + " / " + num2 + " = " + calculatorServiceImpl.calculateDivide(num1, num2);
        }
    }
}
