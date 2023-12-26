package za.co.squnga.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.entity.Product;
import za.co.squnga.exception.ProductRepositoryNullException;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.repository.ProductRepository;
import za.co.squnga.repository.customs.CustomProductRepository;
import za.co.squnga.utils.MapperUtil;

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
    public MessageSource messageSource(MessageSource messageSource)
    {return this.messageSource=messageSource;}
    private MapperUtil mapperUtil;
    @Autowired
    @Qualifier("mapperUtil")
    public MapperUtil setMapperUtil(MapperUtil mapperUtil)
    {return this.mapperUtil=mapperUtil;}
     @Autowired
     public ProductRepository productRepository(@Qualifier("productRepository") ProductRepository productRepository)
     {return this.productRepository=productRepository;}
    @Transactional(readOnly = true)
    public Collection<?> getAllProducts(){
        LOGGER.info("Get All Products");
        if(productRepository == null){
            throw new ProductRepositoryNullException("Product repository failed to initialization or is not initialized");
        }
        Collection<ProductDTO> productDTOs = new ArrayList<>();
        LOGGER.debug(" Product Repository Find All Order By Name ASC ");
        for ( Product product : productRepository.findAll()){
            LOGGER.debug("  for ( Product product : productRepository.findAllOrderByNameASC()){ ");
            ProductDTO productDTO = mapperUtil.convertProductEntityToDto(product);
            productDTOs.add(productDTO);
        }
            return productDTOs;
    }
}
