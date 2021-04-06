package com.project.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
