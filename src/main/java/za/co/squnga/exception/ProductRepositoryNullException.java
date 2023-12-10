package za.co.squnga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import za.co.squnga.facade.impl.DefaultProductFacade;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR) // 500
public class ProductRepositoryNullException extends RuntimeException {
    private static final Logger LOGGER = Logger.getLogger(ProductRepositoryNullException.class.getName());
    public  ProductRepositoryNullException(){
        super();
    }
    public  ProductRepositoryNullException(String message, Throwable cause){
        super(message, cause);
    }
    public  ProductRepositoryNullException(String message){
        super(message);
        LOGGER.log(Level.SEVERE,message);
    }
}
