package com.stefanmileski.labemtbackend.repository;

import com.stefanmileski.labemtbackend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
