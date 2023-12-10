package za.co.squnga.facade.impl;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultProductFacade implements ProductFacade {

    private static final Logger LOGGER = Logger.getLogger(DefaultProductFacade.class.getName());
    private @NonNull ProductRepository productRepository;
    public DefaultProductFacade() {
        super();
    }
/*    public ProductFacade(ProductRepository productRepository) {
        super();
        this.productRepository=productRepository;
    }*/

     @Autowired
     public ProductRepository productRepository(){
         return productRepository;
     }

    @Transactional
    public List<ProductDTO> getAllProducts(){
        LOGGER.info("Get All Products");
        if(productRepository == null){
            LOGGER.log(Level.SEVERE,SpringUtil.getApplicationContext().getMessage(WebConstants.PRODUCT_REPOSITORY_NULL,null, Locale.ENGLISH));
            throw new ProductRepositoryNullException(SpringUtil.getApplicationContext().getMessage(WebConstants.PRODUCT_REPOSITORY_NULL,null, Locale.ENGLISH));
        }else {
            LOGGER.info(" productRepository.findAll() " + SpringUtil.getApplicationContext().getMessage(WebConstants.PRODUCT_REPOSITORY_NULL, null, Locale.ENGLISH));
            List<ProductDTO> productDTOs = new ArrayList<>();
            for ( Product product : productRepository.findAll() ){
                ProductDTO productDTO = ProductMapperUtil.convertProductEntityToDto(product);
                productDTOs.add(productDTO);
            }
            return productDTOs;
        }
    }
}
