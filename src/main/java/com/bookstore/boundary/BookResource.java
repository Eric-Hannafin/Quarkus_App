package com.bookstore.boundary;

import com.bookstore.entity.Books;
import com.bookstore.service.BookService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/books")
public class BookResource {

    @Inject
    BookService bookService;

    @GET
    public List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }

    @POST
    public String addBook(Books books){
        bookService.addBook(books);
        System.out.println(books.getAuthor());
        return "Success";
    }
}
