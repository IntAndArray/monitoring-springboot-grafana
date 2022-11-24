package com.learn.intandarray.controller;

import io.micrometer.core.annotation.Counted;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {

    @Counted("greet_count_app")
    @GetMapping("greet")
    public Mono<String>  greet() {
        return Mono.just("Greet");
    }
}
