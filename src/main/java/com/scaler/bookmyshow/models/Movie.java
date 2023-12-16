package com.scaler.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private List<String> cast;
    private String genre;
    private List<String> languages;
}
