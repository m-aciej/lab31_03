package org.example.lab31_03.repository;

import org.example.lab31_03.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
