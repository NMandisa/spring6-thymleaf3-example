package za.co.squnga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import za.co.squnga.dto.ErrorResponseDTO;

import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
public class CustomizedDefaultHandlerExceptionResolver extends DefaultHandlerExceptionResolver {
    @ExceptionHandler(ProductRepositoryNullException.class)
    public final ResponseEntity<ErrorResponseDTO> handleProductRepositoryNullException(Exception ex, WebRequest request) {
        ErrorResponseDTO errorDetails = new ErrorResponseDTO(LocalDateTime.now(),
                ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
}
