package com.example.shopcraft.repository;

import com.example.shopcraft.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}