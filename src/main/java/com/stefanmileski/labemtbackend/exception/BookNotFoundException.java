package com.stefanmileski.labemtbackend.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Could not find book with id: " + id);
    }
}