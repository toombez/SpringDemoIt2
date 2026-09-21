package ru.toombez.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2/")
public class MyNewController {
    @GetMapping("/group/my")
    public String myGroup() {
        return "My group";
    }
}
