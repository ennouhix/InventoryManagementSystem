package com.invman.InvrntoryManagementSystem.repository;

import com.invman.InvrntoryManagementSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
