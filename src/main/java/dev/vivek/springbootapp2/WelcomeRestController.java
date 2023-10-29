package dev.vivek.springbootapp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WelcomeRestController  {
    @GetMapping("/welcome")
    public String getWelcomeMsg() {
        return "Welcome to Spring Boot App 2" + " from " + this.getClass().getSimpleName();
    }
}
