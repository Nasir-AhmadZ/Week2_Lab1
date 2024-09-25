package com.example.lab1_week2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Person")

public class RequestController {
    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hi there";
    }

    @GetMapping("/greet/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your Name is "+ name;
    }

    @GetMapping("/details")
    public String search(@RequestParam String name, @RequestParam String age)
    {
        return name +" "+ age;
    }

    @GetMapping("/calculator")
    public String calc(@RequestParam float num1, @RequestParam float num2, @RequestParam String operation)
    {
        float total=0;
        switch (operation)
        {
            case "add":
                total = num1+num2;
                break;

            case "multiply":
                total = num1*num2;
                break;

            case "divide":
                if (num2==0)
                {
                    System.out.println("cannot divide by 0");
                    break;
                }
                total = num1/num2;
                break;

            case "subtract":
                total = num1-num2;
                break;

            default: break;
        }

        return num1 + operation + num2+ "=" + total;
    }

}
