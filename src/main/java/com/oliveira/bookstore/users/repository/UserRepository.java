package com.oliveira.bookstore.users.repository;

import com.oliveira.bookstore.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
