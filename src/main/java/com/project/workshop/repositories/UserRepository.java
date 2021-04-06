package com.project.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
