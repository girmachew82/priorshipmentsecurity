package com.pshipment.pshipment.exception;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Data
@SuperBuilder

public class ErrorDetails {
    private LocalDateTime timestamp;
    private String message;
    private String details;
    private String developerMessage;


}
