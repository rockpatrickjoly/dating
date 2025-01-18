package com.idyllwild.dating.repositories;

import com.idyllwild.dating.model.entities.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Long> {
}

