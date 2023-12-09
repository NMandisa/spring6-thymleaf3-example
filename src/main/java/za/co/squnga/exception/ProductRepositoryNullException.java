package za.co.squnga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Noxolo.Mkhungo
 */
@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR) // 500
public class ProductRepositoryNullException extends RuntimeException {
    public  ProductRepositoryNullException(){
        super();
    }
    public  ProductRepositoryNullException(String message, Throwable cause){
        super(message, cause);
    }
    public  ProductRepositoryNullException(String message){
        super(message);
    }
}
