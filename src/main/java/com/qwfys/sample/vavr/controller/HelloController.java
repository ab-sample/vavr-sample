package com.qwfys.sample.vavr.controller;

import com.qwfys.sample.vavr.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author liuwenke
 * @since 0.0.1
 */

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
