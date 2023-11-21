package za.co.squnga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Noxolo.Mkhungo
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)//404
public class ProductNotFoundException extends RuntimeException {
    public  ProductNotFoundException(){
        super();
    }
    public  ProductNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    public  ProductNotFoundException(String message){
        super(message);
    }
}
