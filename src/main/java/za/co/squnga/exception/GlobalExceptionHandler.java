package za.co.squnga.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import java.time.format.DateTimeFormatter;

/**
 * @author Noxolo.Mkhungo
 */
@ControllerAdvice(annotations = Controller.class)
public class GlobalExceptionHandler extends DefaultHandlerExceptionResolver {
    private final static Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class.getName());
    private static DateTimeFormatter CUSTOM_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

}
