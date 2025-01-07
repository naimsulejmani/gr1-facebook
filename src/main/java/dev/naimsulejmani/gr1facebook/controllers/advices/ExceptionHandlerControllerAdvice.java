package dev.naimsulejmani.gr1facebook.controllers.advices;

import dev.naimsulejmani.gr1facebook.dtos.ErrorResponseDto;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleEntityNotFoundException(HttpServletRequest request,
                                                                          EntityNotFoundException e) {
        var errorResponse = new ErrorResponseDto();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setError(HttpStatus.NOT_FOUND.name());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setMethod(request.getMethod());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }


    @ExceptionHandler({IllegalArgumentException.class, IllegalStateException.class,
            IndexOutOfBoundsException.class})
    public ResponseEntity<ErrorResponseDto> handleRuntimeException(HttpServletRequest request,
                                                                          Exception e) {
        var errorResponse = new ErrorResponseDto();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setError(HttpStatus.BAD_REQUEST.name());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setMethod(request.getMethod());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorResponseDto> handleException(HttpServletRequest request,
//                                                            Exception e) {
//        var errorResponse = new ErrorResponseDto();
//        errorResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//        errorResponse.setError(HttpStatus.INTERNAL_SERVER_ERROR.name());
//        errorResponse.setMessage(e.getMessage());
//        errorResponse.setPath(request.getRequestURI());
//        errorResponse.setMethod(request.getMethod());
//
//        if(e instanceof EntityNotFoundException) {
//            errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//            errorResponse.setError(HttpStatus.NOT_FOUND.name());
//        } else if(e instanceof IllegalArgumentException || e instanceof IllegalStateException) {
//            errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
//            errorResponse.setError(HttpStatus.BAD_REQUEST.name());
//        }
//
//        return ResponseEntity.status(errorResponse.getStatus()).body(errorResponse);
//    }

}
