package com.bookstore.service;

import com.bookstore.entity.Books;
import com.bookstore.exception.BookServiceException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class BookService implements BookRepository {

    @Transactional
    public List<Books> getAllBooks() {
        return listAll();
    }

    @Transactional
    public void addBook(Books books) {
        try {
            persist(books);
        } catch (RuntimeException e) {
            throw new BookServiceException("Failed to add book: " + e.getMessage(), e);
        }
    }
}
