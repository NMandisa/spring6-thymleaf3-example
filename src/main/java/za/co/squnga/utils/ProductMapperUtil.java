package za.co.squnga.utils;

import lombok.NonNull;
import za.co.squnga.controller.ws.ProductRestController;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.entity.Product;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductMapperUtil {
    private static final Logger LOGGER = Logger.getLogger(ProductMapperUtil.class.getName());
    private ProductMapperUtil(){}
    public static ProductDTO convertProductEntityToDto(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setDescription(product.getDescription());
        productDTO.setActive(product.isActive());
        productDTO.setName(product.getName());
        productDTO.setDateCreated(product.getDateCreated());
        productDTO.setPrice(product.getPrice());
        productDTO.setSku(productDTO.getSku());
        productDTO.setImageUrl(product.getImageUrl());
        productDTO.setLastUpdated(product.getLastUpdated());
        productDTO.setImageUrl(productDTO.getImageUrl());
        return productDTO;
    }

    public static Product convertProductDtoToEntity(@NonNull ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setDescription(productDTO.getDescription());
        product.setActive(productDTO.isActive());
        product.setName(productDTO.getName());
        product.setDateCreated(productDTO.getDateCreated());
        product.setPrice(product.getPrice());
        product.setSku(productDTO.getSku());
        product.setImageUrl(productDTO.getImageUrl());
        product.setLastUpdated(productDTO.getLastUpdated());
        product.setImageUrl(productDTO.getImageUrl());
        return product;
    }

}
