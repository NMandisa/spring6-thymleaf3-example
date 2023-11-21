package za.co.squnga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Noxolo.Mkhungo
 */
@ResponseStatus(code = HttpStatus.CONFLICT) // 409
public class ProductAlreadyExistsException extends RuntimeException {
    public ProductAlreadyExistsException(){
        super();
    }

    public ProductAlreadyExistsException(String message, Throwable cause){
        super(message, cause);
    }

    public ProductAlreadyExistsException(String message){
        super(message);
    }
}
