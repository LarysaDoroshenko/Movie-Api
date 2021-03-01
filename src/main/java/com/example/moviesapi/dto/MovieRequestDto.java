package com.example.moviesapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequestDto {

    private String title;
    private String directorName;
    private LocalDate releaseDate;

}
