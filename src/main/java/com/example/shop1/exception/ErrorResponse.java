package com.example.shop1.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/**
 * эксепш - класс обертка
 * {@link CustomExceptionHandler#handleUserNotFoundException(ElemNotFound)}
 */
public class ErrorResponse {
    private String message;

    private String exMessage;

}