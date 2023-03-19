package com.stefanmileski.labemtbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Author {
    public Author() {}
    @Id
    public Long id;
    public String name;
    public String surname;
    @ManyToOne
    public Country country;
}
