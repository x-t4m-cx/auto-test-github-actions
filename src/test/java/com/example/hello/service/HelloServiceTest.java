package com.example.hello.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @Test
    void shouldHelloWorldReturned(){
        HelloService service = new HelloService();

        String result = service.getHelloWorld();

        assertEquals("Hello, World!", result);
    }
}