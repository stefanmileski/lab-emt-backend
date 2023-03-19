package com.stefanmileski.labemtbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {
    public Author() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String surname;
    @ManyToOne
    public Country country;
}
