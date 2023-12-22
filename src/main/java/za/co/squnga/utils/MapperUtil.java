package za.co.squnga.utils;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.entity.Product;

import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class MapperUtil {
    private static final Logger LOGGER = Logger.getLogger(MapperUtil.class.getName());
    private ModelMapper modelMapper;
    @Autowired
    public ModelMapper modelMapper(@Qualifier("modelMapper") ModelMapper modelMapper){
       return this.modelMapper=modelMapper;
    }
    public MapperUtil(){}
    public ProductDTO convertProductEntityToDto(Product product) {
        ProductDTO productDTO = this.modelMapper.map(product, ProductDTO.class);
        //ProductDTO productDTO = new ProductDTO();
        /*productDTO.setId(product.getId());
        productDTO.setDescription(product.getDescription());
        productDTO.setActive(product.isActive());
        productDTO.setName(product.getName());
        productDTO.setDateCreated(product.getDateCreated());
        productDTO.setPrice(product.getPrice());
        productDTO.setSku(productDTO.getSku());
        productDTO.setImageUrl(product.getImageUrl());
        productDTO.setLastUpdated(product.getLastUpdated());
        productDTO.setImageUrl(productDTO.getImageUrl());*/
        return productDTO;
    }
    public Product convertProductDtoToEntity( ProductDTO productDTO) {
        //Product product = new Product();
        Product product = this.modelMapper.map(productDTO, Product.class);
        /*product.setId(productDTO.getId());
        product.setDescription(productDTO.getDescription());
        product.setActive(productDTO.isActive());
        product.setName(productDTO.getName());
        product.setDateCreated(productDTO.getDateCreated());
        product.setPrice(product.getPrice());
        product.setSku(productDTO.getSku());
        product.setImageUrl(productDTO.getImageUrl());
        product.setLastUpdated(productDTO.getLastUpdated());
        product.setImageUrl(productDTO.getImageUrl());*/
        return product;
    }

}
