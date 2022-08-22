package com.example.angularwithcurd.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class HandleException {

    @ExceptionHandler(value = NoSuchElementException.class)
    public ResponseEntity<Object> handleNoSuchElementException(NoSuchElementException ex){
        return new ResponseEntity<>("employee not found with this id", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = EmptyResultDataAccessException.class)
    public ResponseEntity<Object> handleNoSuchElementExcepti(EmptyResultDataAccessException ex){
        return new ResponseEntity<>("employee not found with this id", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
