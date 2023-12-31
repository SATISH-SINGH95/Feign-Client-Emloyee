package com.employee.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityNotFound {

    private String message;

    private LocalDateTime time;

    private HttpStatus status;

    public EntityNotFound(LocalDateTime time){
        this.time = time;
    }
    
    public EntityNotFound(LocalDateTime time, HttpStatus status){
        this.time = time;
        this.status = status;
    }

    public EntityNotFound(String message, HttpStatus status){
        this.message = message;
        this.status = status;
    }
}
