package com.oliveira.bookstore.books.entity;

import com.oliveira.bookstore.authors.entity.Author;
import com.oliveira.bookstore.entity.Auditable;
import com.oliveira.bookstore.publishers.entity.Publisher;
import com.oliveira.bookstore.users.entity.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private User user;
}
