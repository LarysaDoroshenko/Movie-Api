package com.example.moviesapi.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String entityName, Long id) {
        super(String.format("%s with id: %s not found!", entityName, id));
    }

}
