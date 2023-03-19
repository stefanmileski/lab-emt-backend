package com.stefanmileski.labemtbackend.service;

import com.stefanmileski.labemtbackend.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book getBookById(Long id);

    Book addBook(Book book);

    Book updateBook(Long id, Book book);

    void deleteBook(Long id);

    Book markBookAsRented(Long id);
}
