package za.co.squnga.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import za.co.squnga.response.ErrorResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class.getName());
    private static DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    /*@ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request){
        ErrorResponse error = new ErrorResponse(LocalDateTime.now(),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }*/
    @ExceptionHandler(ProductNotFoundException.class)
    public final ResponseEntity<ErrorResponse> handleProductNotFoundException(Exception ex, WebRequest request){
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER), ex.getMessage(), request.getDescription(false));
        LOGGER.error(ex.getMessage(),new ProductNotFoundException());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);//404
    }

    @ExceptionHandler(ProductAlreadyExistsException.class)
    public final ResponseEntity<ErrorResponse> handleProductAlreadyExistsException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.CONFLICT);//409
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
