package com.stefanmileski.labemtbackend.exception;

public class BookNotAvailableException extends RuntimeException {

    public BookNotAvailableException(Long id) {
        super("No rentable copies of the book with id: " + id);
    }
}