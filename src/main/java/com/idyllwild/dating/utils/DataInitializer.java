package com.idyllwild.dating.utils;

import com.idyllwild.dating.model.entities.Example;
import com.idyllwild.dating.repositories.ExampleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final ExampleRepository repository;

    public DataInitializer(ExampleRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new Example(null, "Sample Data"));
    }
}

