package com.bookstore.service;

import com.bookstore.entity.Books;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static io.restassured.RestAssured.given;
import static org.mockito.ArgumentMatchers.any;

@QuarkusTest
public class BookResourceTest {

    @Mock
    BookService mockBookService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddBook() {
        Books book = new Books();
        book.setTitle("New Book 111");
        book.setAuthor("John Doe");

        Mockito.doNothing().when(mockBookService).addBook(any(Books.class));

        given()
                .contentType(ContentType.JSON)
                .body(book)
                .when()
                .post("/books")
                .then()
                .statusCode(200);
    }
}
