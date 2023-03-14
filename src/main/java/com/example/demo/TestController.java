package com.example.demo;

import com.example.demo.dto.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TestController {
    @GetMapping("/test")
    public String getHello() {
        return "Hello world";
    }

    @PostMapping("/test2")
    public String getTest(@RequestBody @Valid User user) {
        String id = user.getId();
        String pw = user.getPw();

        return "id = " + id + " pw = " + pw;
    }
}
