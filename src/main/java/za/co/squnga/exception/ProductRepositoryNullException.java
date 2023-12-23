package za.co.squnga.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @author Noxolo.Mkhungo
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR) // 500
public class ProductRepositoryNullException extends RuntimeException {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductRepositoryNullException.class.getName());
    public  ProductRepositoryNullException(){
        super();
    }
    public  ProductRepositoryNullException(String message){
        super(message);
        LOGGER.error(message);
    }
}
