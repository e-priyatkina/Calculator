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
    public String calculatePlus(@RequestParam int num1, @RequestParam int num2) {
        return serviceImpl.calculatePlus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculateMinus(@RequestParam int num1, @RequestParam int num2) {
        return serviceImpl.calculateMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam int num1, @RequestParam int num2) {
        return serviceImpl.calculateMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String calculateDivide(@RequestParam int num1, @RequestParam int num2){
        return serviceImpl.calculateDivide(num1, num2);
    }
}
