package com.example.shop1.exception;

import com.example.shop1.loger.FormLogInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * эксепш - класс {@link CustomExceptionHandler#handleInvalidTraceIdException(IFElementExist)}
 */
@ResponseStatus(HttpStatus.NOT_FOUND)

public class ElemNotFoundChecked extends Exception {

  public ElemNotFoundChecked() {

  }

  public ElemNotFoundChecked(String textMessage) {
    super("Exception: " + textMessage + FormLogInfo.getInfo());
    System.err.println("Exception: " + textMessage + FormLogInfo.getException());
  }
}

