package za.co.squnga.facade;

import za.co.squnga.dto.ProductDTO;
import za.co.squnga.entity.Product;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductFacade {
    List<ProductDTO> getAllProducts();

}
