package za.co.squnga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import za.co.squnga.dto.ErrorResponseDTO;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@ControllerAdvice
public class CustomizedDefaultHandlerExceptionResolver extends DefaultHandlerExceptionResolver {
    private final static Logger LOGGER = Logger.getLogger(CustomizedDefaultHandlerExceptionResolver.class.getName());
    @ExceptionHandler(ProductRepositoryNullException.class)
    public final ResponseEntity<Collection<?>> handleProductRepositoryNullException(Exception ex, WebRequest request) {
        ErrorResponseDTO errorDetails = new ErrorResponseDTO(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(errorDetails,null, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
}
