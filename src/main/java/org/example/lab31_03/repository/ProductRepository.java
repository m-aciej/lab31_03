package org.example.lab31_03.repository;

import org.example.lab31_03.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
