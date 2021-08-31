package com.oliveira.bookstore.authors.repository;

import com.oliveira.bookstore.authors.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
