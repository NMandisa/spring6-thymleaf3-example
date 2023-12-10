package za.co.squnga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.facade.impl.DefaultProductFacade;
import za.co.squnga.service.ProductService;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */

@Service
public class DefaultProductService implements ProductService {
    private ProductFacade productFacade = new DefaultProductFacade();
    @Autowired
    public ProductFacade productFacade(){
       return productFacade ;
    }
    @Override
    public List<ProductDTO> ProductList() {
        return productFacade.getAllProducts();
    }
}
