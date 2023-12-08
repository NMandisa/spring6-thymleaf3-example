package za.co.squnga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import za.co.squnga.entity.Product;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.service.ProductService;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Service
public class DefaultProductService implements ProductService {
    private  ProductFacade productFacade;
    @Autowired
    public ProductFacade productFacade(ProductFacade productFacade){
       return this.productFacade=productFacade;
    }
    @Override
    public List<Product> ProductList() {
        return productFacade.getAllProducts();
    }
}
