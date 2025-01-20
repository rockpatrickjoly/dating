package com.idyllwild.dating.controllers;

import com.idyllwild.dating.model.entities.Example;
import com.idyllwild.dating.repositories.ExampleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ExampleController {
    private final ExampleRepository repository;

    public ExampleController(ExampleRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/examples")
    public List<Example> getExamples() {
        System.out.println("Getting all examples de merde");
        List<Example> all = repository.findAll();
        System.out.println(String.format("Got all examples %d", all.size()));
        return repository.findAll();
    }
}

