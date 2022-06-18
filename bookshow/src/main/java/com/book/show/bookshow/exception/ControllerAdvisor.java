package com.book.show.bookshow.exception;


import com.book.show.bookshow.model.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.*;


@ControllerAdvice
@Slf4j
public class ControllerAdvisor extends ResponseEntityExceptionHandler {


    @ExceptionHandler({Exception.class})
    public ResponseEntity<ApiResponse> handleException(Exception e) {
        log.error(e.getMessage(), e);
        if (e instanceof IllegalArgumentException || e instanceof DataIntegrityViolationException) {
            return new ResponseEntity(new ApiResponse<>(BAD_REQUEST.value(),
                    e.getMessage(), null), BAD_REQUEST);
        }
        return new ResponseEntity(new ApiResponse<>(INTERNAL_SERVER_ERROR.value(),
                e.getMessage(),null), INTERNAL_SERVER_ERROR);
    }

}
