package com.example.moviesapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name = "movie")
@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String directorName;
    private LocalDate releaseDate;

}
