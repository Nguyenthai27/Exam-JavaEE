package com.example.exam-javaee

.repository;

import com.example.exam-javaee

.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<SaleEntity, Long> {
}
