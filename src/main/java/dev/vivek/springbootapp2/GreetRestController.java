package dev.vivek.springbootapp2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class GreetRestController {
    @GetMapping("/greet")
    public String getGreet() {
        return "Hello from Spring Boot App 2";
    }
    /*@GetMapping("/wish")
    public String getWishMsg() {
        return "Good Morning";
    }*/
    @GetMapping("/quote")
    public String getQuote() {
        return "Quote of the day";
    }
    @GetMapping("/wish")
    public ResponseEntity<String> getWishMsg(){
        String msg = "Good Morning";
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
