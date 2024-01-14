package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String calculatePlus(
            @RequestParam (required = false) Integer num1,
            @RequestParam (required = false) Integer num2)
        {
        if (num1 == null || num2 == null) {
            return "Введите оба значения!";
        } else {
            return num1 + " + " + num2 + " = " + calculatorService.calculatePlus(num1, num2);
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
            return num1 + " - " + num2 + " = " + calculatorService.calculateMinus(num1, num2);
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
            return num1 + " * " + num2 + " = " + calculatorService.calculateMultiply(num1, num2);
        }
    }

    @GetMapping("/divide")
    public String calculateDivide(
            @RequestParam (required = false) Integer num1,
            @RequestParam (required = false) Integer num2)
    {
        if (num1 == null || num2 == null) {
            return "Введите оба значения!";
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.calculateDivide(num1, num2);
        }
    }
}
