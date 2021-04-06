package com.project.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
