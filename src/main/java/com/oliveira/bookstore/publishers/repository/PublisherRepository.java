package com.oliveira.bookstore.publishers.repository;

import com.oliveira.bookstore.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
