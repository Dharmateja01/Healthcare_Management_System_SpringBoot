package com.Healthmanagement.HMS.APIres;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private int ststus;
    private boolean success;
    private String message;
    private LocalDateTime TimeStamp;
    private T data;
}
