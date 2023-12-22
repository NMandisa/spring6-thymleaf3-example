package za.co.squnga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import za.co.squnga.dto.ErrorResponseDTO;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.logging.Logger;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    private final static Logger LOGGER = Logger.getLogger(CustomizedResponseEntityExceptionHandler.class.getName());
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponseDTO> handleAllExceptions(Exception ex, WebRequest request){
        ErrorResponseDTO error = new ErrorResponseDTO(LocalDateTime.now(),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
    @ExceptionHandler(ProductNotFoundException.class)
    public final ResponseEntity<ErrorResponseDTO> handleProductNotFoundException(Exception ex, WebRequest request){
        ErrorResponseDTO errorDetails = new ErrorResponseDTO(LocalDateTime.now(),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);//404
    }

    @ExceptionHandler(ProductAlreadyExistsException.class)
    public final ResponseEntity<ErrorResponseDTO> handleProductAlreadyExistsException(Exception ex, WebRequest request) {
        ErrorResponseDTO errorDetails = new ErrorResponseDTO(LocalDateTime.now(),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.CONFLICT);//409
    }
    @ExceptionHandler(ProductRepositoryNullException.class)
    public final ResponseEntity<Collection<?>> handleProductRepositoryNullException(Exception ex, WebRequest request) {
        ErrorResponseDTO errorDetails = new ErrorResponseDTO(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(errorDetails,null, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }

   /* @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) ->{
            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(fieldName, message);
        });
        return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);//400
    }*/

}
