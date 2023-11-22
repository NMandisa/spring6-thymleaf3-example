package za.co.squnga.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Product;
import za.co.squnga.repository.ProductRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */

@ComponentScan("za.co.squnga.facade")
public class HomPageFacade {

    private static final Logger LOGGER  = LoggerFactory.getLogger(HomPageFacade.class);

    @Autowired
    private final ProductRepository productRepository;
    public HomPageFacade(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }


}
