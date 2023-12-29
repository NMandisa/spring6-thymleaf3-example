package za.co.squnga.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import za.co.squnga.response.ErrorResponse;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

@RestControllerAdvice(annotations ={RestController.class})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalRestExceptionHandler extends ResponseEntityExceptionHandler{
    private final static Logger LOGGER = LoggerFactory.getLogger(GlobalRestExceptionHandler.class.getName());
    private static DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    /*@ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request){
        ErrorResponse error = new ErrorResponse(LocalDateTime.now(),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }*/

    @ExceptionHandler(value = {ProductRepositoryNullException.class})
    @ResponseBody
    public final ResponseEntity<?> handleProductRepositoryNullException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER), ex.getMessage(), request.getDescription(false));
        LOGGER.error(ex.getMessage(),ProductRepositoryNullException.class);
        return new ResponseEntity<>(errorDetails,null, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
    @ExceptionHandler(value = {ProductNotFoundException.class})
    @ResponseBody
    public final ResponseEntity<?> handleProductNotFoundException(Exception ex, WebRequest request){
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER), ex.getMessage(), request.getDescription(false));
        LOGGER.error(ex.getMessage(),new ProductNotFoundException());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);//404
    }

    @ExceptionHandler(value = {ProductAlreadyExistsException.class})
    @ResponseBody
    public final ResponseEntity<?> handleProductAlreadyExistsException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.CONFLICT);//409
    }
    @ExceptionHandler(value = {NullPointerException.class})
    @ResponseBody
    public final ResponseEntity<?> handleNullPointerException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
    @ExceptionHandler(value = {SQLException.class, ArithmeticException.class, SQLDataException.class})
    @ResponseBody
    public final ResponseEntity<?> handleSQLDataException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    @ResponseBody
    public final ResponseEntity<?> handleConflict(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);//409
    }
    @ExceptionHandler({ AccessDeniedException.class })
    @ResponseBody
    public final ResponseEntity<?> handleAccessDeniedException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.FORBIDDEN);//403
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
