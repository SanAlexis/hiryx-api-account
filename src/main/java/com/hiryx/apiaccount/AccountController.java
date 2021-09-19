package com.hiryx.apiaccount;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/account")
    public Greeting greeting(@RequestParam(value = "email") String email) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}