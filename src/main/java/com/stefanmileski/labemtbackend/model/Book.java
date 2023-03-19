package com.stefanmileski.labemtbackend.model;

import com.stefanmileski.labemtbackend.model.enums.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    public Book(){}
    @Id
    public Long id;
    public String name;
    public Category category;
    @ManyToOne
    public Author author;
    public Integer availableCopies;
}
