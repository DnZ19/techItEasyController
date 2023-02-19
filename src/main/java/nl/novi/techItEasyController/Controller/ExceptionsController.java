package nl.novi.techItEasyController.Controller;

import nl.novi.techItEasyController.Exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsController {

    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> exception(RecordNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
    .
    @ExceptionHandler(value = IndexOutOfBoundsException.class)
    public ResponseEntity<Object> exception(IndexOutOfBoundsException exception) {
        return new ResponseEntity<>(exception.getMessage(),HttpStatus.NOT_FOUND);
    }

}
