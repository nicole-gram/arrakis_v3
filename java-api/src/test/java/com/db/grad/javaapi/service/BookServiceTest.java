package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetAllBooks() {
        // Prepare
        List<Book> mockBooks = new ArrayList<>();
        mockBooks.add(new Book(1L, "Trading_book_4"));
        mockBooks.add(new Book(2L, "Trading_book_6"));

        when(bookRepository.findAll()).thenReturn(mockBooks);

        // Execute
        List<Book> result = bookService.getAllBooks();

        // Verify
        assertEquals(2, result.size());
        assertEquals("Trading_book_4", result.get(0).getName());
        assertEquals("Trading_book_6", result.get(1).getName());
    }

    @Test
    void testGetBookById_ExistingId() {
        // Prepare
        Long bookId = 1L;
        Book mockBook = new Book(bookId, "Trading_book_4");

        when(bookRepository.findById(bookId)).thenReturn(Optional.of(mockBook));

        // Execute
        Book result = bookService.getBookById(bookId);

        // Verify
        assertNotNull(result);
        assertEquals("Trading_book_4", result.getName());
    }

    @Test
    void testGetBookById_NonExistingId() {
        // Prepare
        Long nonExistingId = 10L;

        when(bookRepository.findById(nonExistingId)).thenReturn(Optional.empty());

        // Execute and Verify
        assertThrows(EntityNotFoundException.class, () -> bookService.getBookById(nonExistingId));
    }

    @Test
    void testCreateBook() {
        // Prepare
        Book bookToCreate = new Book(null, "New Book");

        when(bookRepository.save(bookToCreate)).thenReturn(new Book(1L, "New Book"));

        // Execute
        Book createdBook = bookService.createBook(bookToCreate);

        // Verify
        assertNotNull(createdBook.getId());
        assertEquals("New Book", createdBook.getName());
    }

    @Test
    void testUpdateBook() {
        // Prepare
        Long bookId = 1L;
        Book existingBook = new Book(bookId, "Trading_book_4");
        Book updatedBookData = new Book(null, "Updated Book");

        when(bookRepository.findById(bookId)).thenReturn(Optional.of(existingBook));
        when(bookRepository.save(existingBook)).thenReturn(existingBook);

        // Execute
        Book updatedBook = bookService.updateBook(bookId, updatedBookData);

        // Verify
        assertNotNull(updatedBook);
        assertEquals(bookId, updatedBook.getId());
        assertEquals("Updated Book", updatedBook.getName());
    }

    @Test
    void testDeleteBook() {
        // Prepare
        Long bookId = 1L;

        // Execute
        bookService.deleteBook(bookId);

        // Verify
        verify(bookRepository, times(1)).deleteById(bookId);
    }
}
