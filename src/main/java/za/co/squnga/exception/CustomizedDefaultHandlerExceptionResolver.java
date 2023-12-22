package za.co.squnga.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import za.co.squnga.response.ErrorResponse;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@ControllerAdvice
public class CustomizedDefaultHandlerExceptionResolver extends DefaultHandlerExceptionResolver {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomizedDefaultHandlerExceptionResolver.class.getName());
    @ExceptionHandler(ProductRepositoryNullException.class)
    public final ResponseEntity<Collection<ErrorResponse>> handleProductRepositoryNullException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(errorDetails,null, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
}
