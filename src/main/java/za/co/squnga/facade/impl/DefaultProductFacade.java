package za.co.squnga.facade.impl;

import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.entity.Product;
import za.co.squnga.exception.ProductRepositoryNullException;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.repository.ProductRepository;
import za.co.squnga.utils.MapperUtil;
import za.co.squnga.web.WebConstants;

import java.util.*;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
public class DefaultProductFacade implements ProductFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductFacade.class.getName());
    private ProductRepository productRepository;
    private MessageSource messageSource;
    @Autowired
    public MessageSource messageSource()
    {return messageSource;}
    private MapperUtil mapperUtil;
    @Autowired
    @Qualifier("mapperUtil")
    public MapperUtil setMapperUtil()
    {return mapperUtil;}
     @Autowired
     @Qualifier("productRepository")
     public ProductRepository productRepository()
     {return productRepository;}
    public Collection<?> getAllProducts(){
        LOGGER.info("Get All Products");
        if(productRepository == null){
            throw new ProductRepositoryNullException("Product repository failed to initialization or is not initialized");
        }
        LOGGER.debug(" Product Repository Find All() " + messageSource.getMessage(WebConstants.PRODUCT_REPOSITORY_NULL, null, Locale.getDefault()),ProductRepositoryNullException.class);
        Collection<ProductDTO> productDTOs = new ArrayList<>();
        for ( Product product : productRepository.findAll() ){
            ProductDTO productDTO = mapperUtil.convertProductEntityToDto(product);
            productDTOs.add(productDTO);
        }
            return productDTOs;
    }
}
