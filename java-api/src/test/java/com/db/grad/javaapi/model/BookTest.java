package com.db.grad.javaapi.model;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class BookTest {

    @Test
    public void testBookConstructorAndGetters() {
        // Create a Book object using the constructor
        Long bookId = 1L;
        String bookName = "Test Book";
        Book book = new Book(bookId, bookName);

        // Check if the constructor sets the fields correctly
        Assert.assertEquals(bookId, book.getId());
        Assert.assertEquals(bookName, book.getName());
    }

    @Test
    public void testSetters() {
        // Create a Book object using the default constructor
        Book book = new Book();

        // Set the fields using setters
        Long bookId = 2L;
        String bookName = "Another Book";
        book.setId(bookId);
        book.setName(bookName);

        // Check if the setters update the fields correctly
        Assert.assertEquals(bookId, book.getId());
        Assert.assertEquals(bookName, book.getName());
    }
}