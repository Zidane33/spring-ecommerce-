package com.Backend.Zidane.Store.App;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectionsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/collections")
    public Collections Collections(@RequestParam(value = "collection") String collection) {
        return new Collections(counter.incrementAndGet(), String.format(template, collection));
    }
}