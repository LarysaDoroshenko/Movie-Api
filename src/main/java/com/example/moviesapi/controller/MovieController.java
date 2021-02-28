package com.example.moviesapi.controller;

import com.example.moviesapi.dto.MovieRequestDto;
import com.example.moviesapi.dto.MovieResponseDto;
import com.example.moviesapi.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/{id}")
    public ResponseEntity<MovieResponseDto> getMovieById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<MovieResponseDto> createMovie(@RequestBody MovieRequestDto movieRequestDto) {
        MovieResponseDto movie = movieService.create(movieRequestDto);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

}
