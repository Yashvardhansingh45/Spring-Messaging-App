package com.example.firstspringapp.helloController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello, " + name + " from BridgeLabz!";
    }

    @GetMapping("/hello/param/{name}")
    public String sayHelloPath(@PathVariable String name)
    {
        return "Hello, " + name + " from BridgeLabz!";
    }
}