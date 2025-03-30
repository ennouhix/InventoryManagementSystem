package com.invman.InvrntoryManagementSystem.repository;

import com.invman.InvrntoryManagementSystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
