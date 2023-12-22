package za.co.squnga.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@ControllerAdvice
public class CustomizedDefaultHandlerExceptionResolver extends DefaultHandlerExceptionResolver {
    private final static Logger LOGGER = Logger.getLogger(CustomizedDefaultHandlerExceptionResolver.class.getName());

}
