package com.pshipment.pshipment.restexceptionhandler;

import com.pshipment.pshipment.exception.CustomExceptionHandlerDetail;
import com.pshipment.pshipment.exception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.time.LocalDateTime;

@ControllerAdvice
@SuppressWarnings({"uncheked","rawtype"})
@Slf4j
public class RestHandler {
    @ExceptionHandler(UserNotFoundException.class)

    public ResponseEntity<CustomExceptionHandlerDetail>
    handleResourceNotFoundException(UserNotFoundException ex) {
        return new ResponseEntity<>(CustomExceptionHandlerDetail.builder()
                .timestamp(LocalDateTime.now())
                .developerMessage(ex.getClass().getName())
                .message("Ooopss u made a mistake ")
                .details(ex.getMessage())
                .build(), HttpStatus.NOT_FOUND);
    }
}
