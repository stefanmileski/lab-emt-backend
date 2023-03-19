package com.stefanmileski.labemtbackend.service.implementation;

import com.stefanmileski.labemtbackend.exception.BookNotAvailableException;
import com.stefanmileski.labemtbackend.exception.BookNotFoundException;
import com.stefanmileski.labemtbackend.model.Book;
import com.stefanmileski.labemtbackend.repository.BookRepository;
import com.stefanmileski.labemtbackend.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book bookDetails) {
        Book book = getBookById(id);
        book.setName(bookDetails.getName());
        book.setCategory(bookDetails.getCategory());
        book.setAuthor(bookDetails.getAuthor());
        book.setAvailableCopies(bookDetails.getAvailableCopies());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
    }

    @Override
    public Book markBookAsRented(Long id) {
        Book book = getBookById(id);
        if (book.getAvailableCopies() > 0) {
            book.setAvailableCopies(book.getAvailableCopies() - 1);
            bookRepository.save(book);
        } else {
            throw new BookNotAvailableException(id);
        }
        return book;
    }
}
