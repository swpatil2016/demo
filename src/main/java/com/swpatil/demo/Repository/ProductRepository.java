package com.swpatil.demo.Repository;

import com.swpatil.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    public Product save(Product product);


    public Optional<Product> findById (UUID uuid);

    @Query(value = "select * from product", nativeQuery = true)
    public List<Product> getAll();

}
