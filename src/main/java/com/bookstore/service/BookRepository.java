package com.bookstore.service;

import com.bookstore.entity.Books;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface BookRepository extends PanacheRepository<Books> {
}
