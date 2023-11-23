package za.co.squnga.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Product;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.repository.ProductRepository;
import za.co.squnga.repository.WarehouseRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */

@Component
public class HomePageFacade {

    private static final Logger LOGGER  = LoggerFactory.getLogger(HomePageFacade.class);
    private ProductRepository productRepository;
    private WarehouseRepository warehouseRepository;

    @Autowired
    @Qualifier("warehouseRepository")
    public void setWarehouseRepository(WarehouseRepository warehouseRepository) {
        this.warehouseRepository =  warehouseRepository;
    }

    @Autowired
    @Qualifier("productRepository")
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = false)
    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Warehouse> getAllWarehouses(){
        return  warehouseRepository.findAll();
    }

}
