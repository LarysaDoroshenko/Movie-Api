package com.example.moviesapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class MovieResponseDto {

    private Long id;
    private String title;
    private String directorName;
    private LocalDate releaseDate;

}
