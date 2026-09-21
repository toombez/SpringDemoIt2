package ru.toombez.demoproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello-world")
    public String getHelloWorld() {
        return "Hello world";
    }
}
