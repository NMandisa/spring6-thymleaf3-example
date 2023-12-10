package za.co.squnga.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Product;
import za.co.squnga.facade.ProductFacade;
import za.co.squnga.facade.impl.DefaultProductFacade;
import za.co.squnga.repository.ProductRepository;
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
    public List<Product> ProductList() {
        return productFacade.getAllProducts();
    }
}
