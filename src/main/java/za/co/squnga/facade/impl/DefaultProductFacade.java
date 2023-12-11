package za.co.squnga.facade.impl;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.entity.Product;
import za.co.squnga.exception.ProductRepositoryNullException;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.repository.ProductRepository;
import za.co.squnga.utils.ProductMapperUtil;
import za.co.squnga.utils.SpringUtil;
import za.co.squnga.web.WebConstants;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultProductFacade implements ProductFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultProductFacade.class.getName());
    private ProductRepository productRepository;
    public DefaultProductFacade() {
        super();
    }
    public DefaultProductFacade(ProductRepository productRepository) {
        super();
        this.productRepository=productRepository;
    }

     /*public ProductRepository productRepository(){
         return productRepository;
     }
*/
    public Collection<?> getAllProducts(){
        LOGGER.info("Get All Products");
        if(productRepository == null){
            //LOGGER.log(Level.SEVERE,SpringUtil.getApplicationContext().getMessage(WebConstants.PRODUCT_REPOSITORY_NULL,null, Locale.ENGLISH));
            throw new ProductRepositoryNullException("Product repository failed to initialization or is not initialized");
        }
        LOGGER.info(" Product Repository Find All() " + SpringUtil.getApplicationContext().getMessage(WebConstants.PRODUCT_REPOSITORY_NULL, null, Locale.ENGLISH));
        Collection<ProductDTO> productDTOs = new ArrayList<>();
        for ( Product product : productRepository.findAll() ){
            ProductDTO productDTO = ProductMapperUtil.convertProductEntityToDto(product);
            productDTOs.add(productDTO);
        }
            return productDTOs;
    }
}
