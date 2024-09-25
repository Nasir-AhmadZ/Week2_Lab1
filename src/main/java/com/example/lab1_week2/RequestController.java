package com.example.lab1_week2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Person")

public class RequestController {
    /*@GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hi there";
    }*/

    @GetMapping("/greet/{name}")
    public String myName(@PathVariable String name)
    {
        return "Your Name is "+ name;
    }

}
