package za.co.squnga.facade.impl;

import lombok.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Product;
import za.co.squnga.exception.ProductRepositoryNullException;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.repository.ProductRepository;
import za.co.squnga.utils.SpringUtil;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultProductFacade implements ProductFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultProductFacade.class.getName());
    private static final String PRODUCT_REPOSITORY_NULL = "product.repository.null";
    private @NonNull ProductRepository productRepository;
   /* @Autowired
    public DefaultProductFacade(){
        super();
        this.productRepository =  instanceof ProductRepository;
    }*/
    public DefaultProductFacade() {
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
        if(Objects.isNull(productRepository)){
            LOGGER.info("if(Objects.isNull(productRepository)) "+SpringUtil.getApplicationContext().getMessage(PRODUCT_REPOSITORY_NULL,null, Locale.ENGLISH));
            throw new ProductRepositoryNullException(SpringUtil.getApplicationContext().getMessage(PRODUCT_REPOSITORY_NULL,null, Locale.ENGLISH));
        }else
            LOGGER.info(" productRepository.findAll() "+SpringUtil.getApplicationContext().getMessage(PRODUCT_REPOSITORY_NULL,null, Locale.ENGLISH));
            return  productRepository.findAll();

    }
}
