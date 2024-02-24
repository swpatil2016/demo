package com.swpatil.demo.Repository;

import com.swpatil.demo.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
    public Category save(Category category);

    public Optional<Category> findById(UUID uuid);
}
