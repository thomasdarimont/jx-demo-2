package com.github.thomasdarimont.training.jx.jxdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

@RestController
@RequestMapping("/")
class GreetingController {

    @GetMapping
    Object greet(@RequestParam(defaultValue = "World") String name) {
        Map<Object, Object> map = new HashMap<>();
        map.put("greeting", "Hola " + name);
        map.put("timestamp", Instant.now());
        return map;
    }
}