package com.project.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
