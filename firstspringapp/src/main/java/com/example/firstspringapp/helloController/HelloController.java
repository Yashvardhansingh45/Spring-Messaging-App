package com.example.firstspringapp.helloController;
import com.example.firstspringapp.model.UserDTO;
import org.springframework.web.bind.annotation.*;

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
    public String sayHelloPath(@PathVariable String name) {
        return "Hello, " + name + " from BridgeLabz!";
    }

    @PostMapping("/hello/post")
    public String sayHelloPost(@RequestBody UserDTO user){
        return "Hello, " + user.getFirstName() +" "+ user.getLastName() + " from BridgeLabz!";
    }
}
