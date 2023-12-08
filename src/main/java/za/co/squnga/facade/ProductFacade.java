package za.co.squnga.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Product;
import za.co.squnga.repository.ProductRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component("productFacade")
public class ProductFacade {
    private static final Logger LOGGER  = LoggerFactory.getLogger(ProductFacade.class.getName());
    @Qualifier("productRepository")
    private  ProductRepository productRepository;
    public ProductFacade() {
        super();
    }
/*    public ProductFacade(ProductRepository productRepository) {
        super();
        this.productRepository=productRepository;
    }*/

    /* @Autowired
     public ProductRepository productRepository(){
         return productRepository;
     }*/
    @Transactional
    public List<Product> getAllProducts(){
        LOGGER.info("Get All Products");
        return  productRepository.findAll();
    }
}
