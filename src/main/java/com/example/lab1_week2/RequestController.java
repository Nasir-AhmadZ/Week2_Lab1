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
    

}
