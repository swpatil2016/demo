package com.swpatil.demo.Repository;

import com.swpatil.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    public Product save(Product product);

    public Optional<Product> findById (UUID uuid);
}
