package za.co.squnga.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.co.squnga.entity.Product;
import za.co.squnga.repository.ProductRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class ProductFacade {
    private static final Logger LOGGER  = LoggerFactory.getLogger(ProductFacade.class.getName());
    private ProductRepository productRepository;
    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }
}
