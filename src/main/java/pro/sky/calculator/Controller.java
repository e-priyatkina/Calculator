package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private final ServiceImpl serviceImpl;

    public Controller(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    @GetMapping
    public String hello() {
        return serviceImpl.hello();
    }

    @GetMapping("/plus")
    public String calculatePlus(
            @RequestParam (required = false) Integer num1,
            @RequestParam (required = false) Integer num2)
        {
        if (num1 == null || num2 == null) {
            return "Введите оба значения!";
        } else {
            return serviceImpl.calculatePlus(num1, num2);
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
            return serviceImpl.calculateMinus(num1, num2);
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
            return serviceImpl.calculateMultiply(num1, num2);
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
            return serviceImpl.calculateDivide(num1, num2);
        }
    }
}
