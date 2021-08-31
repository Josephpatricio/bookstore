package com.oliveira.bookstore.books.repository;

import com.oliveira.bookstore.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
