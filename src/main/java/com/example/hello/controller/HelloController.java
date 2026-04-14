package com.example.hello.controller;

import com.example.hello.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {
    private final HelloService service;

    @GetMapping("/hello")
    public String getHelloWorld() {
        return service.getHelloWorld();
    }
}
