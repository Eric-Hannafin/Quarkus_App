package com.bookstore.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Books extends PanacheEntityBase {

    @Id
    @Column(name = "TITLE")
    public String title;

    @Column(name = "AUTHOR")
    public String author;

    @Column(name = "ISBN")
    public String isbn;

    @Column(name = "PUBLICATION_DATE")
    public Date publicationDate;

    @Column(name = "DESCRIPTION")
    public String description;

    @Column(name = "PUBLISHER")
    public String publisher;

    @Column(name = "GENRE")
    public String genre;

    @Column(name = "PRICE")
    public double price;

    @Column(name = "LANGUAGE")
    public String language;

    @Column(name = "NUM_PAGES")
    public int numPages;

    @Column(name = "AVERAGE_RATING")
    public double averageRating;

    @Column(name = "AVAILABILITY")
    public boolean availability;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumPages() { return numPages; }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
