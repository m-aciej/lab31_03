package org.example.lab31_03.repository;

import org.example.lab31_03.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
