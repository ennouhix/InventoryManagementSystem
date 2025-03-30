package com.invman.InvrntoryManagementSystem.repository;

import com.invman.InvrntoryManagementSystem.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
