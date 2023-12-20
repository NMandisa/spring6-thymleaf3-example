package za.co.squnga.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.service.ProductService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */

@Service
@Scope("singleton")
public class DefaultProductService implements ProductService {
    private static final Logger LOGGER  = LoggerFactory.getLogger(ProductService.class.getName());
    private ProductFacade productFacade;
    @Autowired
    public ProductFacade productFacade(@Qualifier("defaultProductFacade") ProductFacade productFacade){
       return this.productFacade=productFacade ;
    }
    @Override
    public Collection<?> ProductList() {
        return productFacade.getAllProducts();
    }
}
