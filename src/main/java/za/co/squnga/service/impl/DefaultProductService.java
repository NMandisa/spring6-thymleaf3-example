package za.co.squnga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Product;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.repository.ProductRepository;
import za.co.squnga.service.ProductService;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Service

public class DefaultProductService implements ProductService {

    private ProductFacade productFacade;
    @Autowired
    @Qualifier("productFacade")
    public ProductFacade productFacade(){
       return this.productFacade = new ProductFacade();
    }
    @Override
    @Transactional
    public List<Product> ProductList() {
        return productFacade.getAllProducts();
    }
}
