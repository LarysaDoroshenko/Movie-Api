package com.example.moviesapi.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class MovieRequestDto {

    private String title;
    private String directorName;
    private LocalDate releaseDate;

}
