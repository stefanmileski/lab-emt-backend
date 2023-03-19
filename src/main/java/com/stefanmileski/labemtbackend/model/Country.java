package com.stefanmileski.labemtbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
    public Country(){}
    @Id
    public Long id;
    public String name;
    public String continent;
}
