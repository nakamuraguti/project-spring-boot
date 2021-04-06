package com.project.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
