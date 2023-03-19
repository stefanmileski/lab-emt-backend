package com.stefanmileski.labemtbackend.model;

import com.stefanmileski.labemtbackend.model.enums.Category;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    public Book(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    @Enumerated(EnumType.STRING)
    public Category category;
    @ManyToOne
    public Author author;
    public Integer availableCopies;
}
