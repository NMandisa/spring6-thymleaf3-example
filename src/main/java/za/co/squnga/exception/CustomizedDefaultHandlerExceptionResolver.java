package za.co.squnga.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import za.co.squnga.response.ErrorResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@ControllerAdvice
public class CustomizedDefaultHandlerExceptionResolver extends DefaultHandlerExceptionResolver {
    private final static Logger LOGGER = LoggerFactory.getLogger(CustomizedDefaultHandlerExceptionResolver.class.getName());
    private static DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @ExceptionHandler(ProductRepositoryNullException.class)
    public final ResponseEntity<Collection<ErrorResponse>> handleProductRepositoryNullException(Exception ex, WebRequest request) {
        ErrorResponse errorDetails = new ErrorResponse(LocalDateTime.now().format(CUSTOM_FORMATTER), ex.getMessage(), request.getDescription(false));
        LOGGER.error(ex.getMessage(),ProductRepositoryNullException.class);
        return new ResponseEntity(errorDetails,null, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
}
