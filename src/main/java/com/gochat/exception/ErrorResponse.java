package com.gochat.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
    private LocalDateTime timestamp;
    private String path;

    public static ErrorResponse create(HttpStatus status, String message, String path) {
        return new ErrorResponse(
            status.value(),
            message,
            LocalDateTime.now(),
            path
        );
    }
}
