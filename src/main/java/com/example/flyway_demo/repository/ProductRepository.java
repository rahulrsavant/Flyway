package com.example.flyway_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flyway_demo.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

