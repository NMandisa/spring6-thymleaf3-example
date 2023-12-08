package za.co.squnga.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import za.co.squnga.facade.HomePageFacade;
import za.co.squnga.service.ProductService;
import za.co.squnga.service.impl.DefaultProductService;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class ProductController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(ProductController.class.getName());
    private ProductService productService;
    @Autowired
    public ProductService productService (){
        return this.productService=new DefaultProductService();
    }


}
