package com.example.lab1_week2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hi there";
    }


}
